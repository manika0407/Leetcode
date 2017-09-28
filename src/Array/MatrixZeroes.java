package Array;

/**
 * Created by manika on 9/1/17.
 */
public class MatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(row[i] == true || col[j] ==true) matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{0,0,0,5},
                {4,3,1,4},
                {0,1,1,4},
                {1,2,1,3},
                {0,0,1,1}
        };
        new MatrixZeroes().setZeroes(matrix);
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                System.out.println(matrix[i][j]);
    }
}
