package Tree;

/**
 * Created by manika on 4/23/17.
 Given inorder and postorder traversal of a tree, construct the binary tree.
 Note:
 You may assume that duplicates do not exist in the tree.
 */
public class constructTreeFromInorderPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, inorder.length-1, 0, postorder.length-1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart) {
        if (postStart < 0 || inStart < inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postStart]);
        int rIndex = inStart;
        for (int i = inStart; i >= inEnd; i--) {
            if (inorder[i] == postorder[postStart]) {
                rIndex = i;
                break;
            }
        }
        root.right=buildTree(inorder, postorder, inStart, rIndex+1, postStart-1);
        root.left=buildTree(inorder, postorder, rIndex-1, inEnd, postStart- (inStart-rIndex)-1);
        return root;
    }

}
