package Tree;

/**
 * Created by manika on 2/8/17.
 */
public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val==q.val)
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        else
            return false;
    }

    public static void main(String[] args) {
        TreeNode p=new TreeNode(4);
        TreeNode q=new TreeNode(5);
        TreeNode s=new TreeNode(6);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(5);
        TreeNode c=new TreeNode(6);
        a.setLeft(b);
        p.setLeft(q);
        a.setRight(c);
        p.setRight(s);
        System.out.println(new sameTree().isSameTree(a,p));
    }
}
