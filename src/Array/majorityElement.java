package Array;

import java.util.Arrays;

/**
 * Created by manika on 5/23/17.
 */
public class majorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] nums={3,7,9,10,10,10,10,10};
        System.out.println(new majorityElement().majorityElement(nums));
    }
}
