package Array;

/**
 * Created by manika on 9/1/17.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */
public class maximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxHerePre=nums[0];
        int minHerePre=nums[0];
        int maxSoFar=Integer.MIN_VALUE;
        int maxHere=0, minHere=0;
        for(int i=1;i<nums.length;i++){
            maxHere=Math.max(Math.max(maxHerePre*nums[i], minHerePre*nums[i]), nums[i]);
            minHere=Math.min(Math.min(maxHerePre*nums[i],minHerePre*nums[i]), nums[i]);
            maxSoFar=Math.max(maxSoFar, maxHere);
            maxHerePre=maxHere;
            minHerePre=minHere;
        }
return maxSoFar;
    }

    public static void main(String[] args) {
        int[] a={2,3,-2,4};
        System.out.println(new maximumProductSubarray().maxProduct(a));
    }
}
