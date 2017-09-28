//package Tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
///**
// * Created by manika on 9/4/17.
// Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.
//
// The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.
//
// Example 1:
// Input:
//
// 1
// /   \
// 3     2
// / \     \
// 5   3     9
//
// Output: 4
// Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9)
// */
//public class maximumWidthBinaryTree {
//    public int widthOfBinaryTree(TreeNode root) {
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//        int maxWidth=Integer.MIN_VALUE;
//        queue.add(root);
//        while(!queue.isEmpty()){
//            int size=queue.size();
//            if(size>maxWidth)
//                maxWidth=size;
//            for(int i=0;i<size;i++){
//                TreeNode cur=queue.poll();
//                if(cur.left!=null)
//                    queue.add(cur.left);
//                if(cur.left==null)
//                    queue.add(new TreeNode(0));
//                if(cur.right!=null)
//                    queue.add(cur.right);
//                if(cur.right==null)
//                    queue.add(new TreeNode(0));
//            }
//        }
//        return maxWidth;
//    }
//
//    public static void main(String[] args) {
//        TreeNode root=new TreeNode(0);
//        root.left=new TreeNode(3);
//        root.right=new TreeNode(2);
//        root.left.left=new TreeNode(5);
//        root.left.right=new TreeNode(3);
//        root.right.right=new TreeNode(9);
//        System.out.println(new maximumWidthBinaryTree().widthOfBinaryTree(root));
//    }
//}
