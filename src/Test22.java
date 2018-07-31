import java.util.ArrayList;
import java.util.LinkedList;

/*
从上往下打印二叉树
题目描述
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Test22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i<size; i++) {
                TreeNode node = queue.removeFirst();
                res.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return res;
    }
}
