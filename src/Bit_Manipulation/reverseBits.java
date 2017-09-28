package Bit_Manipulation;

/**
 * Created by manika on 8/20/17.
 * Reverse bits of a given 32 bits unsigned integer.

 For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class reverseBits {
    public int reverseBits(int n) {
        int reverse = 0;
        for(int i=0;i<32;i++){
            int bit = (n >> i) & 1;
            reverse+= (bit << (31-i));
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n=43261596;
        System.out.println(new reverseBits().reverseBits(n));
    }
}
