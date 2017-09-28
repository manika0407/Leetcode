package Tree;

/**
 * Created by manika on 6/27/17.
 */
public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);

        return root;

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
        TreeNode x=new invertBinaryTree().invertTree(a);
        System.out.println(x.val);
        System.out.println(x.left.val);
        System.out.println(x.right.val);
        System.out.println(x.left.left.val);
        System.out.println(x.left.right.val);

    }
}
