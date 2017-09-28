package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manika on 9/8/17.
 Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str){
        String[] strArray = str.split(" ");
        if(strArray.length!=pattern.length())
            return false;
        Map map=new HashMap();
        for(int i=0;i<strArray.length;i++){
            if(map.put(pattern.charAt(i),i)!=map.put(strArray[i], i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
    }
}
