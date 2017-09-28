package DynamicProgramming;

import java.util.*;

/**
 * Created by manika on 4/23/17.
 */
public class concatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        ArrayList<String> result=new ArrayList<String>();
        Set<String> preWords=new HashSet<String>();
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
    for(int i=0;i<words.length;i++){
        if(canForm(words[i],preWords)){
            result.add(words[i]);
        }
        preWords.add(words[i]);
    }
    return result;
    }

    private boolean canForm(String word, Set<String> preWords) {
    if(preWords.isEmpty()) return false;
    boolean[] dp=new boolean[word.length()+1];
    dp[0]=true;
    for(int i=1;i<=word.length();i++){
        for(int j=0;j<i;j++){
            if(!dp[j]) continue;
            if(preWords.contains(word.substring(j,i))){
                dp[i]=true;
                break;
            }
        }
    }
    return dp[word.length()];
    }
}
