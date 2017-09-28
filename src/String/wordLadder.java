package String;

import java.util.*;

/**
 * Created by manika on 8/18/17.
 */
public class wordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        queue.add(null);

        Set<String> visited= new HashSet<String>();
        visited.add(beginWord);

        int level=1;

        while (!queue.isEmpty()){
            String str=queue.poll();

            if(str!=null){
                for(int i=0;i<str.length();i++){
                    char[] chars=str.toCharArray();
                    for(char c='a'; c<='z';c++){
                        chars[i]=c;
                        String word=new String(chars);

                        if(word.equals(endWord)) return level+1;

                        if(wordList.contains(word) && !visited.contains(word)){
                            queue.add(word);
                            visited.add(word);
                        }
                    }
                }
            }
            else{
                level++;
                queue.add(null);
            }
        }

        return 0;

    }
}
