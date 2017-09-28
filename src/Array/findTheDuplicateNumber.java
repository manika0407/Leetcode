package Array;

/**
 * Created by manika on 9/6/17.
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

 Note:
 You must not modify the array (assume the array is read only).
 You must use only constant, O(1) extra space.
 Your runtime complexity should be less than O(n2).
 There is only one duplicate number in the array, but it could be repeated more than once.

 */
public class findTheDuplicateNumber {
    //we use bit manipulation to solve this problem, complexity=O(32*n) where n is the length of given array
    // we and bit for numbers of array(b) and we also and it with numbers from 1 to n(a). If b>a, that means that this numbers occurs more than once, thus it is duplicate.
    public int findDuplicate(int[] nums) {
        int n=nums.length-1, res=0;
        for(int p=0;p<32;p++){
            int bit=(1<<p), a=0, b=0;
            for(int i=0;i<=n;i++){
                if(i>0 && (i&bit)>0) ++a;
                if((bit & nums[i]) >0) ++b;
            }
            if(b>a) res+=bit;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(new findTheDuplicateNumber().findDuplicate(arr));
    }
}
