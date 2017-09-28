package Array;

/**
 * Created by manika on 3/17/17.
 */
public class plusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int sum,carry;
        carry=0;
        for(int i=n-1;i>=0;i--) {
           if(digits[i]==9)
           {
               digits[i]=0;

           }
           else{
                digits[i]++;
                return digits;
           }
        }
        int[] newnumber=new int[n+1];
        newnumber[0]=1;
        return newnumber;
    }
}
