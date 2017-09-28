package Tree;

/**
 * Created by manika on 4/23/17.
 * Invert a binary tree.
 */
public class invertTree {
    public TreeNode invertTree(TreeNode root){
        if(root!=null)
            inverTreeUtil(root);
        return root;
    }

    private void inverTreeUtil(TreeNode p) {
        TreeNode temp=p.left;
        p.left=p.right;
        p.right=temp;
        if(p.left!=null)
            inverTreeUtil(p.left);
        if(p.right!=null)
            inverTreeUtil(p.right);
    }
}
