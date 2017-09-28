package Tree;

/**
 * Created by manika on 2/8/17.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
    }
    public static void main(String[] args) {
        TreeNode p=new TreeNode(4);
        TreeNode q=new TreeNode(5);
        TreeNode s=new TreeNode(6);
        TreeNode a=new TreeNode(4);
        TreeNode b=new TreeNode(5);
        TreeNode c=new TreeNode(6);
        a.setLeft(b);
        p.setLeft(q);
        a.setRight(c);
        p.setRight(s);
        System.out.println(new SymmetricTree().isSymmetric(a,p));
    }
}
