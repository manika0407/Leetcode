package DynamicProgramming;

/**
 * Created by manika on 4/16/17.
 */
public class CoinChange2 {
    public static int change(int amount, int[] coins) {
        if(coins.length==0 && amount >0) return 0;
        if(coins.length ==0 && amount ==0) return 1;
        int m=coins.length;
        int n=amount;
        return changeInit(coins,m,n);
    }

    private static int changeInit(int[] coins, int m, int n) {
        int x,y,i,j;
        int[][] table=new int[n+1][m];
        for(i=0;i<m;i++)
            table[0][i]=1;
        for(i=1;i<n+1;i++){
            for(j=0;j<m;j++){
                x = (i-coins[j] >= 0)? table[i - coins[j]][j]: 0;
                y=(j>=1)?table[i][j-1]:0;
                table[i][j]=x+y;
            }
        }
        return table[n][m-1];
    }

    public static void main(String[] args) {
        int[] coins={1,2,3};
        int n=7;
        System.out.println(change(n,coins));
    }
}
