package Tree;

import java.util.LinkedList;

/**
 * Created by manika on 2/7/17.
 */
public class hasPathSum {
    public boolean hasPathSum(TreeNode root,int sum){
        if(root==null) return false;
        if(root.val==sum && root.left==null && root.right==null)
            return true;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
    public boolean hasPathSumiterative(TreeNode root,int sum){
        if(root==null) return false;
        LinkedList<TreeNode> node=new LinkedList<TreeNode>();
        LinkedList<Integer> values=new LinkedList<Integer>();
        node.add(root);
        values.add(root.val);
        while(!node.isEmpty()){
            TreeNode curr=node.poll();
            int sumValue=values.poll();
            if(curr.left==null && curr.right==null && sumValue==sum)
                return true;
            if(curr.left!=null)
            {
                node.add(curr.left);
                values.add(sumValue+curr.left.val);
            }
            if(curr.right!=null){
                node.add(curr.right);
                values.add(sumValue+curr.right.val);
            }
        }
        return false;
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
        System.out.println(new hasPathSum().hasPathSum(a,10));
        System.out.println(new hasPathSum().hasPathSumiterative(a,10));

    }
}
