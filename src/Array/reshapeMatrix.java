package Array;

/**
 * Created by manika on 6/15/17.
 */
public class reshapeMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m=nums.length;
        int n=nums[0].length;
        if(m*n!=r*c)
            return nums;
        int[][] result=new int[r][c];
        int row=0, col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[row][col]=nums[i][j];
                col++;
                if(col==c)
                {
                    col=0;
                    row++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        int r=1, c=4;
        int[][] result=new int[r][c];
        result=new reshapeMatrix().matrixReshape(arr,r,c);
        System.out.println(result[0][0]);
        System.out.println(result[0][1]);
        System.out.println(result[0][2]);
        System.out.println(result[0][3]);
    }
}
