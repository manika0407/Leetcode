/**
 * Created by manika on 2/3/17.
 */
public class QuickSort {
    public static void quicksort(int[] arr,int a,int b){
        if(a<b) {
            int p = partition(arr, a, b);
            quicksort(arr,a,p-1);
            quicksort(arr,p+1,b);
        }
    }
    public static int partition(int[] arr,int i,int j){
        int pivot=arr[j];
        int p=i-1;
        int cur=i;
        while(cur<j){
            if(arr[cur]<=pivot){
                swap(arr[p+1],arr[cur]);
                p++;
            }
            cur++;
        }
        swap(arr[p+1],arr[j]);
        return p+1;

    }

    private static void swap(int x, int y) {
        int swap=x;
        x=y;
        y=swap;
    }

    public static void main(String[] args) {
        int[] arr={4,1,3,8,2};
        for(int i:arr)
            System.out.print(i+" ");

        quicksort(arr,0,5);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
