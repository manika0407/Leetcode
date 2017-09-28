package Array;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by manika on 7/10/17.
 You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

 The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

 Example 1:
 Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 Output: [-1,3,-1]
 Explanation:
 For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 For number 1 in the first array, the next greater number for it in the second array is 3.
 For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 */
public class nextGreaterElement {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int num: nums){
            while(!stack.isEmpty() && stack.peek()<num)
                hm.put(stack.pop(), num);
            stack.push(num);

        }

        for(int i=0;i<findNums.length;i++)
        {
            findNums[i]=hm.getOrDefault(findNums[i], -1);

        }
        return findNums;
    }

    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1, 3, 4, 2};
        int[] result=new nextGreaterElement().nextGreaterElement(nums1, nums2);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
