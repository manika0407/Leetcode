package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 6/25/17.
 */
public class BinaryTreePaths {
    private String separator="";
    public List<String> binaryTreePaths(TreeNode root){
        List<String> allPaths=new ArrayList<String>();
        binaryTreePaths(root, allPaths, new StringBuffer());
        return allPaths;
    }

    private void binaryTreePaths(TreeNode root, List<String> allPaths, StringBuffer curString) {
        if(root==null)
            return;
        curString.append(separator).append(root.val);
        separator="->";
        if(root.right==null && root.left==null)
        {
            allPaths.add(curString.toString());
            return;
        }
        binaryTreePaths(root.left, allPaths, curString);
        binaryTreePaths(root.right, allPaths, curString);

    }
}
