package Math;

/**
 * Created by manika on 5/11/17.
 */
public class AddDigits {
    public int addDigits(int num) {
        if(num==0) return num;
        return (num%9==0)?9:(num%9);
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(0));
    }
}
