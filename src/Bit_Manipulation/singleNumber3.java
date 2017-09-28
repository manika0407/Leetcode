package Bit_Manipulation;

/**
 * Created by manika on 8/24/17.
 */
public class singleNumber3 {
    public int[] singleNumber(int[] nums) {
        int[] singleNumbers=new int[2];
        int xor=nums[0];
        for(int i=1;i<nums.length;i++)
            xor^=nums[i];
        //we are finding rightmost set bit. As both the numbers are unique the numbers will differ in atleast one position
        int bit= xor & ~(xor-1);
        int num1 = 0;
        int num2 = 0;
        //now we are dividing the numbers into two sets- one that have that bit set and ones that have that bit unset. So, In both the groups, all the duplicate elements will cancel
        //leaving unique elements in those sets.
        for(int num: nums){
            if((num & bit) >0)
                num1 ^=num;
            else
                num2 ^=num;

        }

        singleNumbers[0]=num1;
        singleNumbers[1]=num2;
    return singleNumbers;
    }
}
