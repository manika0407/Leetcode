package DynamicProgramming;

import java.util.HashMap;

/**
 * Created by manika on 8/30/17.
 */
public class targetSum {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums==null || nums.length==0)
            return 0;
        return findTargetHelper(nums, 0, 0, S, new HashMap<>());
    }

    private int findTargetHelper(int[] nums, int index, int sum, int S, HashMap<String, Integer> map) {
        String encodeString=index+" "+sum;
        if(map.containsKey(encodeString))
            return map.get(encodeString);
        if(index==nums.length){
            if(sum==S)
                return 1;
            else
                return 0;
        }
        int curNum=nums[index];
        int add=findTargetHelper(nums, index+1, sum-curNum, S, map);
        int subtract=findTargetHelper(nums, index+1, sum+curNum, S, map);
        map.put(encodeString, add+subtract);
        return add+subtract;

    }
}
