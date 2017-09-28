package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 */
public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> allCombinations=new ArrayList<List<Integer>>();
        List<Integer> curCombination=new ArrayList<Integer>();
        Arrays.sort(candidates);
        curCombinationSum2(allCombinations, curCombination,0, target,candidates,0);
        return allCombinations;
    }

    private void curCombinationSum2(List<List<Integer>> allCombinations, List<Integer> curCombination, int curSum, int target, int[] candidates, int start) {
            if(curSum>target) {
                return;
            }
            else if(curSum==target) {
                allCombinations.add(new ArrayList<>(curCombination));
            }
            else
            {
                for(int i=start;i<candidates.length;i++){
                    if(i>start && candidates[i]==candidates[i-1]) continue;
                    curCombination.add(candidates[i]);
                    curCombinationSum2(allCombinations, curCombination, curSum+candidates[i], target, candidates, i+1);
                    curCombination.remove(curCombination.size()-1);
                }
            }

    }

    public static void main(String[] args) {
        int[] arr={10, 1, 2, 7, 6, 1, 5};
        System.out.println(new combinationSum2().combinationSum2(arr, 8));
    }
}
