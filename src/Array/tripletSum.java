package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manika on 4/17/17.
 */
public class tripletSum {
    public static boolean tripletSum(int x, int[] a) {
        // code fights interview problem
        // asked in Amazon

        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            int val=x-a[i];
            int j=i+1;
            int k=a.length-1;
            while(j<k)
            {
                if(a[j]+a[k]==val)
                    return true;
                else if(a[j]+a[k]<val)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length<3)
            return result;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int val=0-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==val){
                    ArrayList<Integer> lst=new ArrayList<Integer>();
                    lst.add(nums[i]);
                    lst.add(nums[j]);
                    lst.add(nums[k]);
                    result.add(lst);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                        j++;
                    while(j<k && nums[k]==nums[k+1])
                        k--;
                }
                else if(nums[j]+nums[k]<val)
                    j++;
                else
                    k--;
            }
            while (i<nums.length-2&&nums[i] == nums[i+1])
                i++;
        }
    return result;
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,3,8};
        System.out.println(tripletSum(6,arr));
        System.out.println(tripletSum(15,arr));
        int[] arr2={-1,0,1,2,-1,4};
        System.out.println(threeSum(arr2));
    }

}
