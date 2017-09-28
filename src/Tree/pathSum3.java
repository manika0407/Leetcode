package Tree;

/**
 * Created by manika on 6/29/17.
 */
public class pathSum3 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return pathSumFrom(root,sum)+pathSum(root.left, sum)+pathSum(root.right,sum);
    }

    private int pathSumFrom(TreeNode node, int sum) {
        if(node==null) return 0;
        return (node.val==sum? 1:0) + pathSumFrom(node.left, sum-node.val) + pathSumFrom(node.right, sum-node.val);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(-3);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(11);
        TreeNode g = new TreeNode(3);
        TreeNode h = new TreeNode(-2);
        TreeNode i = new TreeNode(1);
        a.setLeft(b);
        a.setRight(c);
        c.setLeft(d);
        c.setRight(e);
        d.setLeft(f);
        d.setRight(g);

    }
}
