package Array;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 * Created by manika on 4/9/17.
 */
public class twoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
    int[] arr=new int[2];
    if(numbers==null || numbers.length<2) return arr;
    int i=0;
    int j=numbers.length-1;
    while(i<j){
        int sum=numbers[i]+numbers[j];
        if(sum==target)
        {
            arr[0]=i+1;
            arr[1]=j+1;
            break;
        }
        else if(sum>target)
            j--;
        else
            i++;
    }
    return arr;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] res=new int[2];
        res=twoSum(nums,13);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }

}
