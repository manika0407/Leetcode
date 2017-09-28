package String;

import java.util.Arrays;

/**
 * Created by manika on 9/5/17.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        if(strs!=null && strs.length!=0) {
            Arrays.sort(strs);
            char[] firstString = strs[0].toCharArray();
            char[] LastString = strs[strs.length - 1].toCharArray();

            for (int i = 0; i < firstString.length; i++) {
                if (LastString.length > i && LastString[i] == firstString[i])
                    result.append(LastString[i]);
                else
                    return result.toString();
            }

        }
        return result.toString();
    }
}
