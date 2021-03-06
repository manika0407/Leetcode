package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manika on 7/10/17.
 Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

 Example 1:
 Input:
 3
 / \
 9  20
 /  \
 15   7
 Output: [3, 14.5, 11]
 Explanation:
 The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 */
public class averageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<Double>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        double sum=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                sum+=node.val;
                if(node.left!=null)
                queue.add(node.left);
                if(node.right!=null)
                queue.add(node.right);
            }
            result.add(sum/size);


        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(3);
        a.left=new TreeNode(9);
        a.right=new TreeNode(20);
        a.left.left=new TreeNode(15);
        a.right.right=new TreeNode(7);
        System.out.println(new averageOfLevelsInBinaryTree().averageOfLevels(a));
    }
}
