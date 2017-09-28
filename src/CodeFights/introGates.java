package CodeFights;

/**
 * Created by manika on 4/18/17.
 */
public class introGates {
    public static int lateRides(int n){
        int time1=n/60;
        int time2=n%60;
        String time;
        time= String.valueOf(time1)+String.valueOf(time2);
        int timeint=Integer.parseInt(time);
        int x=Sum(timeint);
        return x;
    }

    private static int Sum(int time) {
        int sum=0;
        while(time>0){
            sum+=time%10;
            time=time/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=244;
        System.out.println(lateRides(num));
    }
}
