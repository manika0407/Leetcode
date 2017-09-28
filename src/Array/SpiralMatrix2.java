package Array;

/**
 * Created by manika on 9/1/17.
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class SpiralMatrix2 {
    public int[][] spiralOrder(int n) {
        int[][] arr=new int[n][n];
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;
        int num=1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            //traverse right
            for(int j=colStart;j<=colEnd;j++){
                arr[rowStart][j]=num++;
            }
            rowStart++;
            //traverse down
            for(int i=rowStart;i<=rowEnd;i++)
                arr[i][colEnd]=num++;
            colEnd--;
            //traverse left
            if(rowStart<=rowEnd) {
                for (int j = colEnd; j >= colStart; j--)
                    arr[rowEnd][j]=num++;
                rowEnd--;
            }
            //traverse up
            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--)
                    arr[i][colStart]=num++;
                colStart++;
            }

        }
        return arr;
    }
}
