package Array;

import static java.lang.Integer.MIN_VALUE;

/**
 * Created by manika on 3/17/17.
 */
public class thirdMax {
    public static int thirdMax(int[] nums) {
        Integer max1=MIN_VALUE;
        Integer max2=MIN_VALUE;
        Integer max3=MIN_VALUE;
        for(Integer n:nums){
            if(n.equals(max1)||n.equals(max2)||n.equals(max3)) continue;
            if(max1==MIN_VALUE || n>max1){
                max3=max2;
                max2=max1;
                max1=n;
            }
            else if(max2==MIN_VALUE || n>max2){
                max3=max2;
                max2=n;
            }
            else if(max3==MIN_VALUE|| n>max3){
                max3=n;
            }
        }
        return max3;
    }

    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(thirdMax(nums));
    }
}
