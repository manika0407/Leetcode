package Array;

/**
 * Created by manika on 4/17/17.
 */
public class kthLargestElementInUnsortedArray {
    public static void main(String[] args) {
        int[] nums={7,3,4,5,6,2};
        System.out.println(kthlargest(nums,0,nums.length-1,2));
    }

    private static int kthlargest(int[] nums, int l,int r,int k) {
        if(k>0 && k<r-l+1){
            int pos=partition(nums,l,r);
            if (pos-l == k-1)
                return nums[pos];
            if (pos-l > k-1)  // If position is more, recur for left subarray
                return kthlargest(nums, l, pos-1, k);

            // Else recur for right subarray
            return kthlargest(nums, pos+1, r, k-pos+l-1);
        }
    return Integer.MAX_VALUE;
    }

    private static int partition(int[] nums, int l, int r) {
        int pivot=nums[r];
        int p=l-1;
        int i=l;
        while(i<r){
            if(nums[i]<=pivot){
                swap(p+1,i,nums);
                p++;
            }
            i++;
        }
        swap(p+1,r,nums);
        return p+1;
    }

    private static void swap(int num, int num1,int[] nums) {
        int temp=nums[num];
        nums[num]=nums[num1];
        nums[num1]=temp;
    }

}
