package Array;

/**
 * Created by manika on 4/24/17.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int[] B=new int[3];
        int[] C=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            B[nums[i]]++;
        }
        for(int i=1;i<3;i++)
        {
            B[i]=B[i]+B[i-1];
        }
        for(int i=nums.length-1;i>=0;i--){
            C[B[nums[i]]-1]=nums[i];
            B[nums[i]]--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=C[i];
        }
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,0,0,1,2,1};
        new SortColors().sortColors(arr);
    }
}
