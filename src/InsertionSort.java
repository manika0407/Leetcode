import java.io.*;
/**
 * Created by manika on 2/3/17.
 */
public class InsertionSort {
public static void doInsertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        while((j>-1) && (arr[j]>key)){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;

    }
}

    public static void main(String[] args) {
        int[] arr={5,2,8,1,9};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        doInsertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
