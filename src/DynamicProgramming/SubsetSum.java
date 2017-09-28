package DynamicProgramming;

/**
 * Created by manika on 4/17/17.
 */
public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={5,2};
        int sum=9;
        System.out.println(isSubsetSum(arr,sum));
    }

    private static boolean isSubsetSum(int[] arr, int sum) {
        boolean[][] temp=new boolean[arr.length+1][sum+1];
        int i,j;
        int n=arr.length;
        for(i=0;i<=n;i++)
            temp[i][0]=true;
        for(j=1;j<=sum;j++)
            temp[0][j]=false;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=sum;j++)
            {
                temp[i][j]=temp[i-1][j];
                if(arr[i-1]<=j)
                    temp[i][j]=temp[i-1][j] || temp[i-1][j-arr[i-1]];
            }
        }

        return temp[n][sum];
    }
}
