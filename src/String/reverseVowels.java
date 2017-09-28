package String;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manika on 4/2/17.
 */
public class reverseVowels {
    public static String reverseVowels(String s){
        char[] list=s.toCharArray();
        Set<Character> set=new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int i=0;
        int j=list.length-1;
        for(;i<j;){
            if(!set.contains(list[i])){
                i++;
                continue;
            }
            if(!set.contains(list[j])){
                j--;
                continue;
            }
            char temp=list[i];
            list[i]=list[j];
            list[j]=temp;
            i++;
            j--;
        }
        return new String(list);
    }

    public static void main(String[] args) {
        String s="Leetcode";
        System.out.println(reverseVowels(s));
    }
}
