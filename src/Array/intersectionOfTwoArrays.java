package Array;

import java.util.HashSet;

/**
 * Created by manika on 6/29/17.
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.

 */
public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set=new HashSet<Integer>();
        HashSet<Integer> intersectSet=new HashSet<Integer>();
        for(int i:nums1)
            nums1Set.add(i);
        for(int i:nums2){
            if(nums1Set.contains(i))
                intersectSet.add(i);
        }
        int[] result=new int[intersectSet.size()];
        int count=0;
        for(int i:intersectSet){
            result[count++]=i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] result=new intersectionOfTwoArrays().intersection(nums1, nums2);
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[0]);
        }

    }
}
