package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manika on 6/29/17.
 * Problem Definition: Given a binary tree, find the leftmost value in the last row of the tree.

 Example 1:
 Input:

 2
 / \
 1   3

 Output:
 1
 *
 */
public class findBottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int result=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode value=queue.poll();
                if(i==0) result=value.val;
                if(value.left!=null) queue.offer(value.left);
                if(value.right!=null) queue.offer(value.right);
            }
        }
    return result;
    }
}
