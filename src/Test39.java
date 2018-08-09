import org.hamcrest.core.Is;

/*
平衡二叉树

题目描述
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Test39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        int leftDepth = Depth(root.left);
        int rightDepth = Depth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1)
            return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int Depth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = Depth(root.left);
        int rightDepth = Depth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}

