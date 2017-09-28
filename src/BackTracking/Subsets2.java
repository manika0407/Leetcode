package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manika on 7/30/17.
 */
public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> allSubsets=new ArrayList<List<Integer>>();
        List<Integer> curSubset=new ArrayList<Integer>();
        Arrays.sort(nums);
        subsets(allSubsets, curSubset, nums, 0);
        return allSubsets;
    }

    private void subsets(List<List<Integer>> allSubsets, List<Integer> curSubset, int[] nums, int start) {
        allSubsets.add(new ArrayList<>(curSubset));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            curSubset.add(nums[i]);
            subsets(allSubsets, curSubset, nums, i+1);
            curSubset.remove(curSubset.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(new Subsets2().subsetsWithDup(nums));
    }
}
