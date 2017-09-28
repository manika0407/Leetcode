package Array;

/**
 * Created by manika on 9/6/17.
 */
public class searchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int rowNum=matrix.length;
        int colNum=matrix[0].length;
        int lo=0, hi=rowNum*colNum-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int midNum=matrix[mid/colNum][mid%colNum];
            if(target==midNum)
                return true;
            else if(target<midNum)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return false;
    }
}
