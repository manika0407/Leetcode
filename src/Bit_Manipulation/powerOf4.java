package Bit_Manipulation;

/**
 * Created by manika on 8/21/17.
 Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

 Example:
 Given num = 16, return true. Given num = 5, return false.

 Follow up: Could you solve it without loops/recursion?
 */
public class powerOf4 {
    public boolean isPowerOfFour(int num) {
        return (num&(num-1)) ==0 && num>0 && (num-1)%3==0;
    }


    public static void main(String[] args) {
        int num=16, num1=8;
        System.out.println(new powerOf4().isPowerOfFour(num));
        System.out.println(new powerOf4().isPowerOfFour(num1));
    }
}
