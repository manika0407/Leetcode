package Array;

public class insertionSort {
    public static void sort(int[] A, int n){
        if(n<A.length){
            int i=0, temp=A[n];
            while(i<n){
                if(A[i]<A[n])
                    i++;

            }

            for(int j=i;j<n;j++)
                A[j+1]=A[j];

            A[i]=temp;
            sort(A, n+1);
        }
    }

    public static void main(String[] args) {
        int[] A={15,5,2};
        sort(A,0);
        System.out.println(A[0]);
    }

}
