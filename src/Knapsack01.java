/**
 * Created by manika on 2/26/17.
 */
public class Knapsack01 {
    public static void main(String[] args) {
        int values[]={3,2,5,7,9};
        int wt[]={4,2,5,1,7};
        int W=15;
        System.out.println(maxValue(values,wt,W));
    }
    public static int max(int a, int b) { return (a > b)? a : b; }
    private static int maxValue(int[] values, int[] wt,int W) {
        int L[][]=new int[values.length+1][W+1];
        for(int i=0;i<=5;i++){
            for(int j=0;j<=W;j++){
                if(i==0||j==0)
                    L[i][j]=0;
                else if(wt[i-1]<=j)
                    L[i][j]=max(L[i-1][j],L[i-1][j-wt[i-1]]+values[i-1]);
                else
                    L[i][j]=L[i-1][j];
            }
        }
        return L[values.length][W];
    }
}
