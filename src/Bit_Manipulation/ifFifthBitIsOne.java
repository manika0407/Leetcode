package Bit_Manipulation;

public class ifFifthBitIsOne {
    public boolean ifFifthBitIsOne(int n){
        for(int i=0;i<27;i++){
            n=(n>>i);
        }
        if((n&1)==1)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int n=25;
        System.out.println(new ifFifthBitIsOne().ifFifthBitIsOne(n));
    }
}
