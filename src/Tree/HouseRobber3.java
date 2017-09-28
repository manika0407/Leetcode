package Tree;

import java.util.HashMap;

/**
 * Created by manika on 7/5/17.
 The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

 Determine the maximum amount of money the thief can rob tonight without alerting the police.

 Example 1:
 3
 / \
 2   3
 \   \
 3   1
 Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 */
public class HouseRobber3 {
    public int rob(TreeNode root){
       return robSum(root, new HashMap<>());
    }

    private int robSum(TreeNode root, HashMap<TreeNode, Integer> map) {
    if(root==null) return 0;
    if(map.containsKey(root)) return map.get(root);

    int val=0;
    if(root.left!=null)
        val+=robSum(root.left.left, map) + robSum(root.left.right, map);
    if(root.right!=null)
        val+= robSum(root.right.left, map)+ robSum(root.right.right, map);

    val =Math.max(val+root.val, robSum(root.left, map)+ robSum(root.right, map));
    map.put(root, val);
    return val;
    }
}
