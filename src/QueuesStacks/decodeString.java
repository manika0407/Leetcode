package QueuesStacks;

import java.util.Stack;

/**
 * Created by manika on 7/17/17.
 */
public class decodeString {
    public String decodeString(String s){
       String res="";
       Stack<Integer> countStack=new Stack<Integer>();
       Stack<String> resStack=new Stack<String>();
       int idx=0;
       while (idx< s.length()){
           if(Character.isDigit(s.charAt(idx))){
               int count=0;
               while (Character.isDigit(s.charAt(idx))){
                   count = 10*count+(s.charAt(idx)-'0');
                   idx++;
               }
               countStack.push(count);
           }
           else if(s.charAt(idx)=='['){
               resStack.push(res);
               res="";
               idx++;
           }
           else if(s.charAt(idx)==']'){
               StringBuilder temp=new StringBuilder(resStack.pop());
               int repeatTimes=countStack.pop();
               for(int i=0;i<repeatTimes;i++){
                   temp.append(res);
               }
               res=temp.toString();
               idx++;
           }
           else
           {
               res+=s.charAt(idx++);
           }
       }
       return res;
    }

    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(new decodeString().decodeString(s));
    }
}
