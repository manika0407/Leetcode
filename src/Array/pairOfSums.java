package Array;

import java.util.HashMap;

/**
 * Created by manika on 4/17/17.
 */
public class pairOfSums {
    public static void main(String[] args) {
        int[] a={1,1,3,2,5};
        System.out.println(pairOfsums(a));
    }

    private static int pairOfsums(int[] a) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:a){
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(map.containsKey(a[i]+a[j]))
                    count++;
            }
        }
        return count;
    }
}
