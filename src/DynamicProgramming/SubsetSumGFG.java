package DynamicProgramming;

public class SubsetSumGFG {
  static boolean isSubsetSum(int[] set, int sum){
    boolean[][] subset = new boolean[sum+1][set.length+1];

    for(int i=0;i<=set.length;i++){
      subset[0][i]=true;
    }

    for(int i=1;i<=sum;i++){
      subset[i][0]=false;
    }

    for(int i=1;i<=sum;i++){
      for(int j = 1;j<=set.length;j++){
        subset[i][j]=subset[i][j-1];
        if(i>=set[j-1]){
          subset[i][j] = subset[i][j] || subset[i-set[j-1]][j-1];
        }
      }
    }

    return subset[sum][set.length];
  }
}
