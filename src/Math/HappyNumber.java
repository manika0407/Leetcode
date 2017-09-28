package Math;

import java.util.HashSet;

/**
 * Created by manika on 5/11/17.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<Integer>();

        while(hs.add(n))
        {
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+=(temp*temp);

                n/=10;
            }
            System.out.println(sum);
            if(sum==1)
                return true;
            else
                n=sum;
        }
        return false;
    }

    public static void main(String[] args) {
        int num=15;
        System.out.println(new HappyNumber().isHappy(num));
    }
}
