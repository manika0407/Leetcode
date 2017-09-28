package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


 Example 1:

 Input: k = 3, n = 7

 Output:

 [[1,2,4]]

 Example 2:

 Input: k = 3, n = 9

 Output:

 [[1,2,6], [1,3,5], [2,3,4]]
 */
public class combinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> allCombinations = new ArrayList<List<Integer>>();
        List<Integer> curCombination = new ArrayList<Integer>();
        combinationSum3(allCombinations, curCombination, 1,0,  n, k);
        return allCombinations;
    }

    private void combinationSum3(List<List<Integer>> allCombinations, List<Integer> curCombination, int start, int curSum, int n, int k) {
       if(curCombination.size()>k)
           return;
       else if(curCombination.size()==k && curSum==n){
           allCombinations.add(new ArrayList<>(curCombination));
       }
       else{
           for(int i=start;i<=9;i++){
            curCombination.add(i);
            combinationSum3(allCombinations, curCombination, i+1, curSum+i, n, k);
            curCombination.remove(curCombination.size()-1);

           }
       }

    }

    public static void main(String[] args) {
        int k=3, n=9;
        System.out.println(new combinationSum3().combinationSum3(k,n));
    }
}
