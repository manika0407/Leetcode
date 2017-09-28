/**
 * Created by manika on 2/15/17.
 */
public class kthsmallest {
     public static int kthsmallest(int arr[],int l,int r,int k){
        if(k>0 && k<=r-l+1){
            int pos=partition(arr, l,r);
            if(pos-l==k)
                return arr[pos];
            if(pos-l>k-1)
                return kthsmallest(arr,l,pos-1,k);

                return kthsmallest(arr,pos+1,r,k-pos+l-1);
        }
        return Integer.MAX_VALUE;
    }

    public static int partition(int[] arr, int l, int r) {
        int p=l-1;
        int cur=l;
        int pivot=arr[r-1];
        while(cur<r){
            if(arr[cur]<=pivot)
            {
                swap(arr[p+1],arr[cur]);
                p++;

            }
            cur++;
        }
        swap(arr[p+1],arr[r]);
        return p+1;
    }

    public static void swap(int i, int i1) {
        int temp=i;
        i=i1;
        i1=temp;
    }

    public static void main(String[] args) {
        int arr[]={15,2,4,37,19};
        System.out.println(kthsmallest(arr,0,arr.length-1,3));
    }
}
