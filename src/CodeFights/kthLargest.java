package CodeFights;

/**
 * Created by manika on 4/20/17.
 */

public class kthLargest {
    public static int kthLargestElement(int[] nums, int k) {
        int l=0;
        int r=nums.length-1;

        return kthLargest2(nums,l, r,k);
    }

    private static int kthLargest2(int[] nums, int l, int r, int k) {
        int x=0;
        if (k > 0 && k <= r - l + 1)
        {

            // Partition the array around last element and get
            // position of pivot element in sorted array
            int pos = partition(nums, l, r);

            // If position is same as k
            if (pos-l == k-1) {
                x = nums[pos];
                            }
            if (pos-l < k-1)  // If position is more, recur for left subarray
                return kthLargest2(nums, l, pos-1, k);

            // Else recur for right subarray
            return kthLargest2(nums, pos+1, r, k-pos+l-1);
        }

        // If k is more than number of elements in array
        return x;
    }


    public static int partition(int[] nums,int low, int high)
        {
            int pivot = nums[low];
            int i = low - 1;
            int j = high + 1;
            while (i < j)
            {
                for (i++; nums[i] < pivot; i++);
                for (j--; nums[j] > pivot; j--);
                if (i < j)
                    swap(nums,i, j);
            }
            return j;
        }
    public static void swap(int[] nums,int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {7, 6, 5, 4, 3, 2, 1};
        int k = 2;
        System.out.println(kthLargestElement(nums, k));
    }
}
