package Tree;

/**
 * Created by manika on 2/8/17.
 */
public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root,0);
    }
    public int sumNumbers(TreeNode root, int current_sum){
        if(root==null) return 0;
        System.out.println(root.val+" "+current_sum);
        int sum=0;
        if(root.left==null && root.right==null)
           sum+=current_sum*10+root.val;
        else {
            if (root.left != null)
                sum += sumNumbers(root.left, current_sum * 10 + root.val);
            if(root.right!=null)
                sum+=sumNumbers(root.right,current_sum*10+root.val);
        }
        return sum;
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(new SumRootToLeaf().sumNumbers(root));
    }
}
