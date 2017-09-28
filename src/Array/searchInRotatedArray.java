package Array;

/**
 * Created by manika on 8/31/17.
 */
public class searchInRotatedArray {
    public int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[lo]<=nums[mid]){
                if(target>=nums[lo] && target<nums[mid])
                    hi=mid-1;
                else
                    lo=mid+1;
            }
            else{
                if(target>nums[mid] && target<nums[mid])
                    lo=mid+1;
                else
                    hi=mid-1;
            }
        }
        return nums[lo]==target?lo:-1;
    }
}
