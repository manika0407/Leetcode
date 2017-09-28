package Array;

import java.util.HashSet;

/**
 * Created by manika on 4/8/17.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.


 */
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        System.out.print(containsDuplicate(arr));
    }
}
