package Tree;

/**
 * Created by manika on 6/25/17.
 *
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

 You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 */
public class mergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null) return t2;
        if(t2==null) return t1;
        TreeNode t3=new TreeNode(t1.val+t2.val);
        t3.setLeft(mergeTrees(t1.left,t2.left));
        t3.setRight(mergeTrees(t1.right,t2.right));
        return t3;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(1);
        TreeNode g = new TreeNode(3);
        TreeNode h = new TreeNode(4);
        TreeNode i = new TreeNode(7);
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);

        e.setLeft(f);
        e.setRight(g);
        f.setRight(h);
        g.setRight(i);

        TreeNode t3=new mergeTrees().mergeTrees(a,e);
        System.out.println(t3.val);
        System.out.println(t3.left.val);
        System.out.println(t3.right.val);
        System.out.println(t3.left.left.val);
        System.out.println(t3.left.right.val);
        System.out.println(t3.right.right.val);

    }
}
