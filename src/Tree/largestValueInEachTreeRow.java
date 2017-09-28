package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manika on 6/29/17.
 */
public class largestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result= new ArrayList<Integer>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode value=queue.poll();
                if(value.val>max)
                {
                    max=value.val;
                }
                if(value.left!=null) queue.offer(value.left);
                if(value.right!=null) queue.offer(value.right);
            }
            result.add(max);
        }
    return result;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(10);

        a.left=b;
        a.right=c;
        a.left.left=d;
        a.left.right=e;
        a.right.right=f;
        a.right.left=g;
        System.out.println(new largestValueInEachTreeRow().largestValues(a));

    }
}
