package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manika on 6/29/17.
 *
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]

 */
public class binaryTreeZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList=new ArrayList<List<Integer>>();
        if(root==null) return resultList;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        boolean leftToRight=true;
        int size=1;

        while(!queue.isEmpty()){
            ArrayList<Integer> partialSet=new ArrayList<Integer>();
            for(int i=0;i<size;i++){

                TreeNode node=queue.poll();
                if(leftToRight) {
                    partialSet.add(node.val);
                }
                else{
                    partialSet.add(0, node.val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            resultList.add(partialSet);
            size=queue.size();
            leftToRight=!leftToRight;
        }

        return resultList;

    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(10);

        a.left=b;
        a.right=c;
        a.left.left=d;
        a.right.right=e;
        a.right.right=f;
        a.right.left=g;

        System.out.println(new binaryTreeZigZagTraversal().zigzagLevelOrder(a));
    }


}
