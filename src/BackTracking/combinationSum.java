package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 */
public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allCombinations = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        List<Integer> curCombination = new ArrayList<Integer>();
        combinationSum(allCombinations, curCombination, 0, target, candidates, 0);
        return allCombinations;
    }

    private void combinationSum(List<List<Integer>> allCombinations, List<Integer> curCombination, int curSum, int target, int[] candidates, int start) {
        if(curSum> target){
            return;
        }
        else if(curSum==target){
            allCombinations.add(new ArrayList<Integer>(curCombination));
            return;
        }
        else{
            for(int i=start;i<candidates.length;i++){
                curCombination.add(candidates[i]);
                combinationSum(allCombinations, curCombination, curSum+candidates[i], target, candidates, i);
                curCombination.remove(curCombination.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={2,3,6,7,1};
        System.out.println(new combinationSum().combinationSum(arr, 7));
    }
}
