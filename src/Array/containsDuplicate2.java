package Array;

import java.util.HashMap;

/**
 * Created by manika on 4/8/17.
 * Given an array of integers and an integer k, find out
 * whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k
 */
public class containsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> ht=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(nums[i])){
                int x=ht.get(nums[i]);
                if(Math.abs(i-x)<=k)
                    return true;
            }
                ht.put(nums[i],i);

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
