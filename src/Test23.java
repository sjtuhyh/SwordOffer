/*
二叉搜索树的后序遍历序列
题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

/*
在后序遍历得到的序列中， 最后一个数字是树的根结点的值。
数组中前面的数字可以分为两部分： 第一部分是左子树结点的值，它们都比根结点的值小：
第二部分是右子树结点的值，它们都比根结点的值大。
 */
public class Test23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        // 输入的数组不能为空，并且有数据
        if (sequence == null || sequence.length <= 0) {
            return false;
        }
        // 有数据，就调用辅助方法  start  end
        return verifySequenceOfBST(sequence, 0, sequence.length-1);
    }

    private boolean verifySequenceOfBST(int[] sequence, int start, int end) {
        // 如果对应要处理的数据只有一个或者已经没有数据要处理（start>end）就返回true
        if (start >= end)
            return true;
        // 从左向右找第一个不小于根结点（sequence[end]）的元素的位置
        int index = start;
        while (index < end - 1 && sequence[index] < sequence[end]) {
            index++;
        }
        int right = index;
        while (index < end-1 && sequence[index] > sequence[end]) {
            index ++;
        }
        if (index != end-1) {
            return false;
        }
        // 执行到此处说明直到目前为止，还是合法的
        // [start, right-1]为根结点左子树的位置
        // [right, end-1]为根结点右子树的位置
        return verifySequenceOfBST(sequence, start, right-1) && verifySequenceOfBST(sequence,right, end-1);
    }


}
