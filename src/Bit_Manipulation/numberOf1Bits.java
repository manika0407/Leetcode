package Bit_Manipulation;

/**
 * Created by manika on 8/20/17.
 *
 */
public class numberOf1Bits {
    public int hammingWeight(int n) {
        int count=0;
       for(int i=0 ; i< 32; i++)
       {
           if(((n >> i) &1)==1){
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        int x=5, y = 32;
        System.out.println(new numberOf1Bits().hammingWeight(x));
        System.out.println(new numberOf1Bits().hammingWeight(y));
    }
}
