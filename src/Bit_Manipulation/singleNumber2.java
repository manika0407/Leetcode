package Bit_Manipulation;

/**
 * Created by manika on 8/24/17.
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class singleNumber2 {
    public int singleNumber(int[] nums) {
       int result=0;
       int[] countarr=new int[32];
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j] >> i) & 1)==1){
                    count++;
                }
            }
            countarr[i]=count;
        }
        for(int i=0;i<32;i++)
            result+=((countarr[i] %3) << (31-i));

        return result;
    }

}
