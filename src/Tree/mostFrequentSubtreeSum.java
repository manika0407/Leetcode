//package Tree;
//
///**
// * Created by manika on 6/29/17.
// Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
//
// Examples 1
// Input:
//
// 5
// /  \
// 2   -3
// return [2, -3, 4], since all the values happen only once, return all of them in any order.
// */
//public class mostFrequentSubtreeSum {
//    int[] result=new int[10];
//    public int[] findFrequentTreeSum(TreeNode root) {
//        while(root!=null){
//            findSubtreeSum(root);
//            findSubtreeSum(root.left);
//        }
//    }
//
//    private void findSubtreeSum(TreeNode root) {
//
//    }
//}
