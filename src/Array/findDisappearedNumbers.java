package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by manika on 4/8/17.
 Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]

 */
public class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        Set<Integer> numSet=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            numSet.add(nums[i]);
        }
        int len=nums.length;
        for(int i=1;i<=len;i++){
            if(!numSet.contains(i))
                result.add(i);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(new findDisappearedNumbers().findDisappearedNumbers(arr));
    }
}
