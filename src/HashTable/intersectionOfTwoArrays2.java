package HashTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by manika on 5/10/17.
 */
public class intersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
//        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i]))
                map1.put(nums1[i], map1.get(nums1[i])+1);
            else
                map1.put(nums1[i],1);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(map1.containsKey(nums2[i]) && map1.get(nums2[i])>0)
            {
                list.add(nums2[i]);
                map1.put(nums2[i],map1.get(nums2[i])-1);
            }
        }
        int[] r=new int[list.size()];
        for(int i=0;i<list.size();i++){
            r[i]=list.get(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr1={1};
        int[] arr2={1,1};
        int[] result=new intersectionOfTwoArrays2().intersect(arr1,arr2);
        for(int i:result)
            System.out.println(i);
    }
}
