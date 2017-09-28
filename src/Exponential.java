/**
 * Created by manika on 2/6/17.
 */
public class Exponential {
    public static int exponential(int k,int n){
        if(n==0) return 1;
        if(n==1) return k;
        int x;
        if(n%2==1)
        {
            x=exponential(k,n-1);
            return x*k;
        }
        else{
            x=exponential(k,n/2);
            return x*x;
        }
    }

    public static void main(String[] args) {
        int k=9,n=3;
        System.out.println(exponential(5,5));
    }
}
