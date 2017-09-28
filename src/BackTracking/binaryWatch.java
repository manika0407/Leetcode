package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 8/1/17.
 A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

 Each LED represents a zero or one, with the least significant bit on the right.


 For example, the above binary watch reads "3:25".

 Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

 Example:

 Input: n = 1
 Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 */
public class binaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> solution=new ArrayList<String>();
        int[] nums1 = new int[]{1, 2, 4,8}, nums2 = new int[]{1,2,4,8,16,32};
        for(int i=0;i<=num;i++){
            List<Integer> list1=generate(nums1, i);
            List<Integer> list2=generate(nums2, num-i);
            for(int num1:list1){
                if(num1>=12) continue;
                for(int num2: list2){
                    if(num2>59) continue;
                    solution.add(num1+":"+(num2>=10?num2: "0"+num2));

                }
            }
        }
        return solution;
    }

    private List<Integer> generate(int[] nums, int count) {
        List<Integer> res=new ArrayList<Integer>();
        generateHelper(nums, count, 0, 0, res);
        return res;
    }

    private void generateHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
        if(count==0) {
            res.add(sum);
            return;
        }
        for(int i=pos;i<nums.length;i++){
            generateHelper(nums, count-1, i+1, sum+nums[i], res);
        }
    }

    public static void main(String[] args) {
        System.out.println(new binaryWatch().readBinaryWatch(1));
    }
}
