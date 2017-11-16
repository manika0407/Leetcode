package DynamicProgramming;

public class RodCutting {
  static int cutRod(int[] array){
    int[] val = new int[array.length+1];
    val[0]=0;

    for(int i=1;i<=array.length;i++){
      int max=Integer.MIN_VALUE;
      for(int j=0;j<i;j++){
        max=Math.max(max, array[j]+val[i-j-1]);
      }
      val[i]=max;
    }
    return val[array.length];
  }

  public static void main(String[] args) {
    int[] arr={1,5,8,9,10,17,17,20};
    System.out.println(cutRod(arr));
  }
}
