package Array;

/**
 * Created by manika on 9/5/17.
 */
public class searchUnsortedArray {
    public boolean search(int[] arr, int x){
        int n=arr.length;
        if(arr[n-1]==x)
            return true;
        int backup=arr[n-1];
        arr[n-1]=x;

        for(int i=0; ;i++){
            if(arr[i]==x){
                arr[n-1]=backup;

                if(i<n-1)
                    return true;
                else
                    return false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,2,8,6};
        System.out.println(new searchUnsortedArray().search(arr, 3));
        System.out.println(new searchUnsortedArray().search(arr, 4));
    }
}
