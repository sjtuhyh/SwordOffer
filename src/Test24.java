import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
二叉树中和为某一值的路径
题目描述
输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Test24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayList<Integer> list = new ArrayList<>();
        dfs(res, list, root, target, 0);
        return res;
    }

    private void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, TreeNode root, int target, int curSum) {
        if (root != null) {
            curSum += root.val;
            list.add(root.val);
            if (curSum < target) {
                dfs(res, list, root.left, target, curSum);
                dfs(res, list, root.right, target, curSum);
            }else if(curSum == target){
                if (root.left == null && root.right == null) {
                    res.add((ArrayList<Integer>)list.clone());
                }
            }
            list.remove(list.size()-1);
        }
    }
}
