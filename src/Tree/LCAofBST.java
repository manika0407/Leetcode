package Tree;

/**
 * Created by manika on 2/7/17.
 */
public class LCAofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while(true) {
            if (root == null) return null;
            if ((p.val < root.val && q.val > root.val)||(p.val>root.val && q.val<root.val)) return root;
            if (p.val > root.val) root=root.getRight();
            if (q.val < root.val) root=root.getLeft();
        }
        }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(12);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(17);
        a.setLeft(b);
        a.setRight(c);
        c.setLeft(d);
        c.setRight(e);
        //d.setLeft(f);
        //d.setRight(g);
        System.out.println(new LCAofBST().lowestCommonAncestor(a,d,e).getval());
    }

}
