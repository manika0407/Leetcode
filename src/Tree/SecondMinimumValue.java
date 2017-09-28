package Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by manika on 9/4/17.
 */
public class SecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root) {
        // Use TreeSet in this problem
        Set<Integer> set=new TreeSet<Integer>();
        dfs(root, set);
        Iterator<Integer> iterator=set.iterator();
        int count=0;
        while(iterator.hasNext()){
            count++;
            int result=iterator.next();
            if(count==2)
            {
                return result;
            }
        }
        return -1;
    }

    private void dfs(TreeNode root, Set<Integer> set) {
        if(root==null)
            return;
        set.add(root.val);
        dfs(root.left, set);
        dfs(root.right, set);
    }
}
