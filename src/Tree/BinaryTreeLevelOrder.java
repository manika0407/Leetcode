package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by manika on 2/7/17.
 */
public class BinaryTreeLevelOrder {
    List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        LinkedList<TreeNode> current=new LinkedList<TreeNode>();
        LinkedList<TreeNode> next=new LinkedList<TreeNode>();
        current.offer(root);
        List<Integer> numberlist=new ArrayList<Integer>();
        while(!current.isEmpty())
        {
            TreeNode head=current.poll();
            numberlist.add(head.val);
            if(head.left!=null) next.offer(head.left);
            if(head.right!=null) next.offer(head.right);

            if(current.isEmpty()){
                current=next;
                next=new LinkedList<TreeNode>();
                result.add(numberlist);
                numberlist=new ArrayList<Integer>();
            }
        }
        return result;
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
        BinaryTreeLevelOrder ins = new BinaryTreeLevelOrder();
        System.out.println(ins.levelOrder(a));
    }
}
