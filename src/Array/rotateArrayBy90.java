package Array;

import java.util.Arrays;

/**
 * Created by manika on 4/17/17.
 */
public class rotateArrayBy90 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=new int[arr.length][arr[0].length];
        result=rotateImage(arr);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] rotateImage(int[][] a) {
        int rows=a.length;
        int cols=a[0].length;
        int[][] temp=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                temp[i][j]=a[rows-j-1][i];
            }
        }
        return temp;
    }
}
