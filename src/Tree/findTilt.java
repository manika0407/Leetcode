package Tree;

/**
 * Created by manika on 6/27/17.
 */
public class findTilt {
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        return Math.abs(sum(root.left)-sum(root.right))+ findTilt(root.left)+findTilt(root.right);
    }

    private int sum(TreeNode root) {
        if(root==null) return 0;
        return root.val+sum(root.left)+ sum(root.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        System.out.println(new findTilt().findTilt(a));
    }
}
