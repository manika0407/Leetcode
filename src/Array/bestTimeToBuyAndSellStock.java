package Array;

/**
 * Created by manika on 4/9/17.
 */
public class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxSofar=0,maxCur=0;
        for(int i=1;i<prices.length;i++){
            maxCur=Math.max(0,maxCur+=prices[i]-prices[i-1]);
            maxSofar=Math.max(maxCur,maxSofar);
        }
        return maxSofar;
    }
}
