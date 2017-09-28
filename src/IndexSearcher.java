/**
 * Created by manika on 2/6/17.
 */
public class IndexSearcher {
    public static int IndexSearcher(int arr[],int i, int j){
        int mid=i+(j-i)/2;
        if(j-i<=1){
            if(arr[i]==i|| arr[j]==j)
                return 1;
            else return 0;
        }
        if(arr[mid]==mid)
            return mid;
        else if(arr[mid]<mid)
            return IndexSearcher(arr,mid+1,j);
        else
            return IndexSearcher(arr,i,mid-1);
    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,3,5};
        System.out.println(IndexSearcher(arr,0,arr.length-1));
    }
}
