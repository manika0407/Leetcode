package CodeFights;

/**
 * Created by manika on 4/18/17.
 */
public class phoneCall {
    public static int phoneCall(int min1, int min2_10, int min11, int s) {
        int x;
        int total=0;
            total=1;
            x=total*min1;
            int s2;
            s2=s-x;
            if((s2)==0)
                return total;
            else if(s2<9) {
                x = (int) Math.floor(s2 / min2_10);
                total+=x;
                s2=s2-x*min2_10;

                //total+=(s2/min11);
            }
            else {
                total += 9;
                x += 9 * min2_10;
                total+=((s-x)/min11);
            }

        return total;
    }


    public static void main(String[] args) {
        int min1 = 1, min2_10 = 2, min11 = 1, s = 6;
        System.out.println(phoneCall(min1, min2_10, min11, s));
    }
}
