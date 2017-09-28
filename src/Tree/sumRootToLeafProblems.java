package Tree;

/**
 * Created by manika on 4/23/17.
 */
public class sumRootToLeafProblems {
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;

        return dfs(root, 0, 0);
    }

    private int dfs(TreeNode node, int num, int sum) {
        if(node==null) return 0;
        num=num*10+node.val;
        if(node.left==null && node.right==null)
        {
            sum+=num;
            return sum;
        }
        sum=dfs(node.left,num,sum)+dfs(node.right,num,sum);
        return sum;

    }
}
