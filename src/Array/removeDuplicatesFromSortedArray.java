package Array;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 * Created by manika on 4/9/17.
 */
public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i=0,n=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
                nums[n++]=nums[i];
        }
        return n;
    }

    public static void main(String[] args) {
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(
             nums
        ));
    }

}
