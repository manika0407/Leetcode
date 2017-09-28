package Array;

/**
 * Created by manika on 9/6/17.
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted in ascending from left to right.
 Integers in each column are sorted in ascending from top to bottom.
 For example,

 Consider the following matrix:

 [
 [1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]
 ]
 Given target = 5, return true.

 Given target = 20, return false.
 */
public class searchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
            return false;
        int rowNum=0;
        int colNum=matrix[0].length-1;
        while(rowNum<matrix.length && colNum>=0){
            if(matrix[rowNum][colNum]==target)
                return true;
            else if(matrix[rowNum][colNum]>target)
                colNum--;
            else
                rowNum++;
        }
        return false;
    }
}
