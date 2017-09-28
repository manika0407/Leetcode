package Array;

import java.util.HashSet;

/**
 * Created by manika on 4/17/17.
 */
public class countPairsWithKDifference {
    public static void main(String[] args) {
    int[] a={1,6,8,2,4,9,12};
    System.out.println(countPairsWithDifference(3,a));

    }
    public static int countPairsWithDifference(int k, int[] a) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:a)
            set.add(i-k);
        int count=0;
        for(int i:a){
            if(set.contains(Math.abs(i)))
                count++;
        }
        return count;
    }
}
