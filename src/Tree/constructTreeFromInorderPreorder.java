package Tree;

/**
 * Created by manika on 3/2/17.
 */
public class constructTreeFromInorderPreorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart=0;
        int preEnd=preorder.length-1;
        int inStart=0;
        int inEnd=inorder.length-1;
        return buildTree(preorder,inorder,preStart,preEnd,inStart,inEnd);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        int val=preorder[preStart];
        TreeNode root=new TreeNode(val);
        int k=0;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==val)
            {
                k=i;
                break;
            }
        }
        root.left=buildTree(preorder,inorder,preStart+1,preStart+(k-inStart),inStart,k-1);
        root.right=buildTree(preorder,inorder,preStart+(k-inStart)+1, preEnd,k+1 , inEnd);
    return root;
    }

}
