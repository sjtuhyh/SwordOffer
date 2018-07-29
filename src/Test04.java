/*
重建二叉树
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Test04 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0 || pre.length!=in.length) {
            return null;
        }
        return construct(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    private TreeNode construct(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        //递归结束条件
        if (ps > pe || is > ie) {
            return null;
        }
        int value = preorder[ps];
        int index = is;
        while (index <= ie && inorder[index] != value) {
            index++;
        }
        if (index > ie) {
            throw new RuntimeException("invalid input");
        }
        TreeNode root = new TreeNode(value);
        root.left = construct(preorder, ps+1, ps+index-is, inorder, is, index-1);   // ps ... pe   in is index ie
        root.right = construct(preorder, ps+index-is+1, pe, inorder, index+1, ie);
        return root;
    }

}
