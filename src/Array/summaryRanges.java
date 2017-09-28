package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 8/31/17.
 */
public class summaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> summaryRange=new ArrayList<String>();
        if(nums.length==1)
        {
            summaryRange.add(nums[0]+"");
            return summaryRange;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(i+1<nums.length &&(nums[i+1]==nums[i]+1))
                i++;
            if(a!=nums[i]){
                summaryRange.add(a+"->"+nums[i]);
            }
            else
                summaryRange.add(a+"");

        }
        return summaryRange;
    }
}
