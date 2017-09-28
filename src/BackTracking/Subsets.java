package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/30/17.
 * Given a set of distinct integers, nums, return all possible subsets.

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets=new ArrayList<List<Integer>>();
        List<Integer> curSubset=new ArrayList<Integer>();
        subsets(allSubsets, curSubset, nums, 0);
        return allSubsets;
    }

    private void subsets(List<List<Integer>> allSubsets, List<Integer> curSubset, int[] nums, int start) {
        allSubsets.add(new ArrayList<>(curSubset));
        for(int i=start;i<nums.length;i++){
            curSubset.add(nums[i]);
            subsets(allSubsets, curSubset, nums, i+1);
            curSubset.remove(curSubset.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] nums={1, 2, 3};
        System.out.println(new Subsets().subsets(nums));
    }
}
