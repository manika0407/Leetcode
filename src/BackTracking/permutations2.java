package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 */
public class permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> allPermutations = new ArrayList<List<Integer>>();
        List<Integer> curPermutation = new ArrayList<Integer>();
        Arrays.sort(nums);
        boolean[] added=new boolean[nums.length];
        permute(allPermutations, curPermutation, nums, added);
        return allPermutations;
    }

    private void permute(List<List<Integer>> allPermutations, List<Integer> curPermutation, int[] nums, boolean[] added) {
        if(curPermutation.size()==nums.length)
        {
            allPermutations.add(new ArrayList<Integer>(curPermutation));

        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if(added[i] || i>0 && nums[i]==nums[i-1] && !added[i-1]) continue;
                added[i]=true;
                curPermutation.add(nums[i]);
                permute(allPermutations, curPermutation, nums, added);
                added[i]=false;
                curPermutation.remove(curPermutation.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={1, 1,2};
        System.out.println(new permutations2().permuteUnique(arr));
    }
}
