package Tree;

import java.util.HashSet;

/**
 * Created by manika on 9/4/17.
 Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:
 Input:
 5
 / \
 3   6
 / \   \
 2   4   7

 Target = 9

 Output: True
 Example 2:
 Input:
 5
 / \
 3   6
 / \   \
 2   4   7

 Target = 28

 Output: False

 */
public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k){
        HashSet<Integer> Values=new HashSet<Integer>();
        return dfs(root, Values, k);
    }

    private boolean dfs(TreeNode root, HashSet<Integer> values, int k) {
        if(root==null)
            return false;
        if(values.contains(k-root.val))
            return true;
        values.add(root.val);
        return dfs(root.left, values, k) || dfs(root.right, values, k);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(new TwoSumIV().findTarget(root, 9));
        System.out.println(new TwoSumIV().findTarget(root, 10));
        System.out.println(new TwoSumIV().findTarget(root, 67));
    }
}
