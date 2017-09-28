package Bit_Manipulation;

/**
 * Created by manika on 8/21/17.
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.
 */
public class addTwoNumbersWithoutplusMinus {
    public int getSum(int a, int b) {
       return (b==0)? a: getSum(a^b, (a&b) <<1);
    }

    public static void main(String[] args) {
        int a=1, b= 2;
        System.out.println(new addTwoNumbersWithoutplusMinus().getSum(a, b));
    }
}
