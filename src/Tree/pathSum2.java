package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 9/3/17.
 */
public class pathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> allPaths=new ArrayList<List<Integer>>();
        pathSum(allPaths, new ArrayList<Integer>(), sum, root);
        return allPaths;
    }

    private void pathSum(List<List<Integer>> allPaths, ArrayList<Integer> path, int sum, TreeNode root) {
        if(root==null)
            return;
        path.add(new Integer(root.val));

        if(root.left==null && root.right==null && sum==root.val){
            allPaths.add(new ArrayList(path));
            path.remove(path.size()-1);
            return;
        }
        else{
            pathSum(allPaths, path, sum-root.val, root.left);
            pathSum(allPaths, path, sum-root.val, root.right);
        }
        path.remove(path.size()-1);


    }
}
