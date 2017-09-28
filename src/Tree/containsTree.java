package Tree;

/**
 * Created by manika on 5/10/17.
 */
public class containsTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) return false;
        if(isSame(s,t))
        {
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.val!=t.val) return false;
        return isSame(s.left,t.left) && isSame(s.right,t.right);
        }

    public static void main(String[] args) {
        TreeNode s=new TreeNode(3);
        TreeNode x=new TreeNode(4);
        TreeNode y=new TreeNode(5);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        s.setLeft(x);
        s.setRight(y);
        x.setLeft(a);
        x.setRight(b);
        TreeNode m=new TreeNode(4);
        TreeNode n=new TreeNode(1);
        TreeNode o=new TreeNode(2);
        m.setLeft(n);
        m.setRight(o);
        System.out.println(new containsTree().isSubtree(s,m));



    }
}
