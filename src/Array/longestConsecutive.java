package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manika on 6/11/17.
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

 For example,
 Given [100, 4, 200, 1, 3, 2],
 The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 */
public class longestConsecutive {
    public int longestConsecutive(int[] nums){
        Set<Integer> elemSet=new HashSet<Integer>();
        for(int num: nums){
            elemSet.add(num);
        }
        int maxLen=0,diff=1;
        for(int num: nums) {
            int leftCount=0;
            while(elemSet.contains(num-diff)){
                leftCount++;
                elemSet.remove(num-diff);
                diff++;
            }
            int rightCount=0;
            while(elemSet.contains(num+diff)){
                rightCount++;
                elemSet.remove(num+diff);
                diff++;
            }
            maxLen=Math.max(maxLen, leftCount+rightCount+1);
            elemSet.remove(num);
        }
        return maxLen;
        }
}

