package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manika on 5/10/17.
 */
public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<>();
        for(int i:nums1)
        {
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i))
              intersect.add(i);
        }
        int[] result=new int[intersect.size()];
        int i=0;
        for(Integer num:intersect)
            result[i++]=num;
        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,2,4};
        int[] arr2={2,2};
        int[] result=new intersectionOfTwoArrays().intersection(arr1,arr2);
        for(int i:result)
            System.out.println(i);
    }
}
