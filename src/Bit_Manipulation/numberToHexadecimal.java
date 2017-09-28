package Bit_Manipulation;

/**
 * Created by manika on 8/23/17.
 */
public class numberToHexadecimal {
    char[] map={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public String toHex(int num) {
        if(num == 0) return "0";
        String hexadecimal= "";
        while(num !=0){
            hexadecimal=map[(num &15)]+hexadecimal;
            num =num >>>4;
        }
        return hexadecimal;
    }

    public static void main(String[] args) {
        int num=-1;
        System.out.println(new numberToHexadecimal().toHex(num));
    }
}
