package Tree;

/**
 * Created by manika on 6/25/17.
 */
public class validateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if(root==null) return true;
        if (root.val >= maxValue || root.val <= minValue) return false;
        return isValidBST(root.left, minValue,root.val) && isValidBST(root.right, root.val, maxValue);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(3);
        a.setLeft(b);
        a.setRight(c);
        System.out.println(new validateBinarySearchTree().isValidBST(a));
    }
}
