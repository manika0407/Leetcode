import java.io.*;

/**
 * Created by manika on 2/3/17.
 */
public class SelectionSort {
    public static void doSelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[index])
                    index = j;

            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }

    public static void main(String[] args) {
        int[] arr={4,2,15,9,7};
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        doSelectionSort(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
