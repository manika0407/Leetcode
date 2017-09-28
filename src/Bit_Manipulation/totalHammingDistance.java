package Bit_Manipulation;

/**
 * Created by manika on 8/20/17.
 */
public class totalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int totalHammingDistance = 0;
        for(int i=0; i < 32; i++){
            int count0=0, count1= 0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j] >> i) & 1)==1){
                    count1++;
                }
                else
                    count0++;
            }
            totalHammingDistance+=count0*count1;
        }
        return totalHammingDistance;
    }
}
