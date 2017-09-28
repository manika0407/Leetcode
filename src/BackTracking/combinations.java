package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */
public class combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> allCombinations=new ArrayList<List<Integer>>();
        List<Integer> curCombination = new ArrayList<Integer>();
        combine(allCombinations, curCombination, n, k, 1);
        return allCombinations;
    }

    private void combine(List<List<Integer>> allCombinations, List<Integer> curCombination, int n, int k, int start) {
        if(curCombination.size()==k) {
            allCombinations.add(new ArrayList<Integer>(curCombination));
        }
        else if(curCombination.size()>k){
            return;
        }
        else{
            for(int i=start;i<=n;i++){
                curCombination.add(i);
                combine(allCombinations, curCombination, n, k, i+1);
                curCombination.remove(curCombination.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int n=4, k=2;
        System.out.println(new combinations().combine(n,k));
    }
}
