package HashTable;

import java.util.HashSet;

/**
 * Created by manika on 5/11/17.
 */
public class bullsAndCows {
    public String getHint(String secret, String guess) {
        int bull=0,cow=0;
        for(int i=0;i<secret.toCharArray().length;i++){
        if(secret.charAt(i)==guess.charAt(i))
            bull++;
        }
        HashSet<Character> hs=new HashSet<Character>();
        for(char c:secret.toCharArray())
            hs.add(c);
        for(char c:guess.toCharArray())
            if(hs.contains(c))
                cow++;
        cow-=bull;
        return ""+bull+"A"+cow+"B";
    }

    public static void main(String[] args) {
        System.out.println(new bullsAndCows().getHint("11","10"));
    }
}
