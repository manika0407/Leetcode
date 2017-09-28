package Array;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by manika on 7/11/17.
 Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.

 Example 1:
 Input: [1,2,1]
 Output: [2,-1,2]
 Explanation: The first 1's next greater number is 2;
 The number 2 can't find next greater number;
 The second 1's next greater number needs to search circularly, which is also 2.
 */
public class nextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int[] next=new int[nums.length];
        Arrays.fill(next, -1);
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<2*nums.length;i++){
            int num=nums[i%nums.length];
            while(!stack.isEmpty() && nums[stack.peek()]<num){
                next[stack.pop()]= num;
            }
            if(i<nums.length) stack.push(i);
        }
        return next;
    }
}
