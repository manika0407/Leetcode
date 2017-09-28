package DynamicProgramming;

/**
 * Created by manika on 4/17/17.
 */
public class Knapsack01 {
    public static void main(String[] args) {
        int[] val={60,100,120};
int n=val.length;
        int[] wt={10,20,30};
        int W=50;
        System.out.println(knapsack(W,wt,val,n));
    }

    private static int knapsack(int W, int[] wt, int[] val, int n) {
        int[][] temp=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
            temp[i][0]=0;
        }
        for(int j=0;j<=W;j++)
            temp[0][j]=0;
        for(int i=1;i<=n;i++)
        {
            for(int w=1;w<=W;w++)
            {
                if(wt[i-1]<=w)
                    temp[i][w]=Math.max(temp[i-1][w],temp[i-1][w-wt[i-1]]+val[i-1]);
                else
                    temp[i][w]=temp[i-1][w];
            }
        }
        return temp[n][W];
    }
}
