package Array;

import java.util.HashSet;

/**
 * Created by manika on 4/17/17.
 */
public class SumOfTwo {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={10,20,30,40};
        System.out.println( sumOfTwo(a,b,22));
    }

    private static boolean sumOfTwo(int[] a, int[] b, int v) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:a)
            set.add(v-i);
        for(int i:b)
        {
            if(set.contains(i))
                return true;
        }
        return false;

    }
}
