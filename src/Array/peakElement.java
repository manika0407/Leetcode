package Array;

/**
 * Created by manika on 8/31/17.
 */
public class peakElement {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private int helper(int[] nums, int start, int end) {
        if(start==end)
            return start;
        else if(end==start+1){
            if(nums[start]>nums[end])
                return start;
            else
                return end;
        }
        else{
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid-1]>nums[mid] && nums[mid]>nums[mid+1])
                return helper(nums, start, mid-1);
            else
                return helper(nums, mid+1, end);

        }


    }
}
