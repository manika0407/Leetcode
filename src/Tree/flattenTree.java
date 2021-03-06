package Tree;

/**
 * Created by manika on 7/6/17.
 * Given a binary tree, flatten it to a linked list in-place.

 For example,
 Given

 1
 / \
 2   5
 / \   \
 3   4   6
 The flattened tree should look like:
 1
 \
 2
 \
 3
 \
 4
 \
 5
 \
 6
 */
public class flattenTree {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;


        root.left=null;
        flatten(left);
        flatten(right);
        root.right=left;
        TreeNode cur=root;
        while(cur.right!=null) cur=cur.right;
        cur.right=right;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(6);
        new flattenTree().flatten(root);
        System.out.println(root.val);
        System.out.println(root.right.val);
        System.out.println(root.right.right.val);
        System.out.println(root.right.right.right.val);
        System.out.println(root.right.right.right.right.val);
        System.out.println(root.right.right.right.right.right.val);
    }
}
