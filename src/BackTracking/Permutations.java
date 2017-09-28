package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/30/17.
 * Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allPermutations = new ArrayList<List<Integer>>();
        List<Integer> curPermutation = new ArrayList<Integer>();
        permute(allPermutations, curPermutation, nums);
        return allPermutations;
    }

    private void permute(List<List<Integer>> allPermutations, List<Integer> curPermutation, int[] nums) {
        if(curPermutation.size()==nums.length)
        {
            allPermutations.add(new ArrayList<Integer>(curPermutation));

        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if(curPermutation.contains(nums[i])) continue;
                curPermutation.add(nums[i]);
                permute(allPermutations, curPermutation, nums);
                curPermutation.remove(curPermutation.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(new Permutations().permute(arr));
    }
}
