package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 6/23/17.
 *
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements that appear twice in this array.

 Could you do it without extra space and in O(n) runtime?

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [2,3]
 */
public class findDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
                list.add(Math.abs(nums[i]));
            else
                nums[index]=-nums[index];
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,3,2};
        System.out.println(new findDuplicates().findDuplicates(arr));
    }
}
