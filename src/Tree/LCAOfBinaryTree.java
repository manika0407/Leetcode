package Tree;

/**
 * Created by manika on 6/27/17.
 */
public class LCAOfBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if(left!=null && right!=null)
            return root;
        return (left!=null)?left:right;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);
        a.left=b;
        a.right=c;
        a.left.left=d;
        a.left.right=e;
        a.right.left=f;
        a.right.right=g;
        TreeNode x= new LCAOfBinaryTree().lowestCommonAncestor(a,f,g);
        System.out.println(x.val);
    }
}
