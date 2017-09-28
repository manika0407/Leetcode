package Array;


import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode : 532
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
 * Created by manika on 4/9/17.
 */

public class kDiffPairs {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int count=0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(k==0){
                if(entry.getValue()>=2)
                    count++;

            }
            else
            {
                if(map.containsKey(entry.getKey()+k))
                    count++;
            }
       }
       return count;
    }

    public static void main(String[] args) {
       int[] nums={3,1,4,1,5};
        int k = 2;

        System.out.println("result"+ new kDiffPairs().findPairs(nums,k));
    }
    }
