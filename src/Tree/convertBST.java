package Tree;

/**
 * Created by manika on 6/28/17.
 */
public class convertBST {
    int inorder_sum=0;
    public TreeNode convertBST(TreeNode root) {
        convertBSTHelper(root);
        return root;
    }


    private void convertBSTHelper(TreeNode root) {
        if(root==null) return;
        convertBSTHelper(root.right);
        root.val+=inorder_sum;
        inorder_sum=root.val;
        convertBSTHelper(root.left);
    }
}
