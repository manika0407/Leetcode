package Tree;

/**
 * Created by manika on 4/23/17.
 */
public class kthSmallestInBST {
    public static int kthSmallest(TreeNode root,int k){
        int count=count(root.left);
        if(count<=k)
            return kthSmallest(root.left, k);
        else if(k > count + 1)
            return kthSmallest(root.right, k-1-count);

        return root.val;

    }

    private static int count(TreeNode root) {
        if (root == null) return 0;
        return 1+count(root.left)+count(root.right);
    }
}
