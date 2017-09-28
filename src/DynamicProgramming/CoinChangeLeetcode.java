package DynamicProgramming;

import java.util.Arrays;

/**
 * Created by manika on 7/24/17.
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that
 * you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

 Example 1:
 coins = [1, 2, 5], amount = 11
 return 3 (11 = 5 + 5 + 1)

 Example 2:
 coins = [2], amount = 3
 return -1.

 Note:
 You may assume that you have an infinite number of each kind of coin.

 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.


 */
public class CoinChangeLeetcode {
    public int coinChange(int[] coins, int amount){
        int max=amount+1;
        int[] dp=new int[max];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i)
                    dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
            }
        }
        return (dp[amount]>amount)?-1:dp[amount];
    }

    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=6;
        System.out.println(new CoinChangeLeetcode().coinChange(coins,amount));
    }
}
