package QueuesStacks;

import java.util.Stack;

/**
 * Created by manika on 6/28/17.
 */
public class isValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> charStack=new Stack<Character>();
       for(char c: s.toCharArray()) {
        if(c=='(')
            charStack.push(')');
        else if(c=='[')
            charStack.push(']');
        else if(c=='{')
            charStack.push('}');
        else if(charStack.isEmpty() || charStack.pop()!=c)
            return false;
       }
       return charStack.isEmpty();
    }

    public static void main(String[] args) {
        String s="])";
        System.out.println(new isValidParentheses().isValid(s));
    }
}
