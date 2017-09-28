package Array;

/**
 * Created by manika on 9/6/17.
 */
public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int num: nums){
            if(i<2 || num!=nums[i-2])
                nums[i++]=num;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3};
        System.out.println(new removeDuplicates().removeDuplicates(arr));
    }
}
