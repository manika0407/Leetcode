package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicates {
    public void removeDuplicates(String str){
        LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
        for(char c:str.toCharArray()){
            hs.add(c);
        }

        for(Character ch: hs){
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        String str = "manika";
        new removeDuplicates().removeDuplicates(str);
    }
}
