package Tree;

/**
 * Created by manika on 2/8/17.
 */
public class balancedBinaryTree {
    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;

    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        int lh=height(root.left);
        int rh=height(root.right);
        int diff=(lh>rh)?(lh-rh):(rh-lh);
        if(diff<=1)
            return isBalanced(root.left) && isBalanced(root.right);
        else return false;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(10);
        TreeNode e = new TreeNode(12);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(17);
        a.setLeft(b);
        a.setRight(c);
        //c.setLeft(d);
        //c.setRight(e);
        //d.setLeft(f);
        //d.setRight(g);

        System.out.println(new balancedBinaryTree().isBalanced(a));
    }
}
