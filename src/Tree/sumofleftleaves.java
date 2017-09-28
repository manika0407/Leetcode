package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manika on 2/7/17.
 */
public class sumofleftleaves {
    public boolean isLeaf(TreeNode n){
        if(n==null) return false;
        if(n.left==null && n.right==null)
            return true;
        else
            return false;
    }
    int leftleavessum(TreeNode root){
        int sum=0;
    if(root!=null) {
        if (root.left != null && isLeaf(root.left)) {
            sum += root.left.val;
        }
        if (root.left != null && !isLeaf(root.left)) {
            sum += leftleavessum(root.left);
        }
        sum += leftleavessum(root.right);

    }
    return sum;
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
        c.setLeft(d);
        c.setRight(e);
        d.setLeft(f);
        d.setRight(g);

        System.out.println(new sumofleftleaves().leftleavessum(a));
    }
}
