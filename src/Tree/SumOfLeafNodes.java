package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manika on 2/7/17.
 * Find the sum of all left leaves in a given binary tree.

 Example:

 3
 / \
 9  20
 /  \
 15   7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24
 */
public class SumOfLeafNodes {
    public int sumofleaves(TreeNode root){
        if(root==null) return 0;
        int sum=0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode head=queue.poll();
            if(head.left==null && head.right==null){
                sum+=head.val;
            }
            if(head.left!=null) queue.offer(head.left);
            if(head.right!=null) queue.offer(head.right);
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

        System.out.println(new SumOfLeafNodes().sumofleaves(a));
    }
}
