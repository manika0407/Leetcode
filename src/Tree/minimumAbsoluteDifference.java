package Tree;

/**
 * Created by manika on 9/1/17.
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

 1
 \
 3
 /
 2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between
 */
public class minimumAbsoluteDifference {
    int minimumValue=Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {

        if(root==null)
            return minimumValue;
        getMinimumDifference(root.left);
        if(prev!=null)
            minimumValue=Math.min(minimumValue, root.val-prev);
        prev=root.val;
        getMinimumDifference(root.right);
        return minimumValue;
    }
}
