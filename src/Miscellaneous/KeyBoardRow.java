package Miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by manika on 3/10/17.
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard
 * Example 1:
 Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 */
public class KeyBoardRow {
    public String[] findWords(String[] words) {
       String[] keyboard={"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
       HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
       for(int i=0;i<keyboard.length;i++)
       {
           for(char c: keyboard[i].toCharArray()){
               hm.put(c, i);
           }
       }
        List<String> res=new ArrayList<String>();
       for(String w: words){
           if(w.equals("")) continue;
           int index=hm.get(w.toUpperCase().charAt(0));
       for(char c: w.toUpperCase().toCharArray()){
            if(hm.get(c)!=index)
            {
                index=-1;
                break;
            }

       }
       if(index!=-1)
           res.add(w);
       }

       // for converting a list of strings into a string array
       return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words={"Hello", "Alaska", "Dad", "Peace"};
        String[] result=new KeyBoardRow().findWords(words);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
