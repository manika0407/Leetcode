package Bit_Manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manika on 8/21/17.
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
 Similar problem can be solved by Bit Manipulation
 */
public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int totalNumber= 1 << (nums.length);
        for(int i =0; i < totalNumber; i++){
            List<Integer> subset = new ArrayList<Integer>();
            for(int j= 0;j< nums.length;j++){
                if((i & (1<< j))!=0){
                    subset.add(nums[j]);
                }


            }
            allSubsets.add(subset);
        }
        return allSubsets;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(new subsets().subsets(nums));
    }
}
