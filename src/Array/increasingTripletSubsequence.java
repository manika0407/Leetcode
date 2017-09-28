package Array;

/**
 * Created by manika on 9/4/17.
 */
public class increasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE, large=Integer.MAX_VALUE;
        for(int n: nums){
            if(n<=small)
                small=n;
            else if(n<=large)
                large=n;
            else
                return true;
        }
        return false;
    }
}
