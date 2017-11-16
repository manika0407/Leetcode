package QueuesStacks;

import java.util.Stack;

/**
 * Created by manika on 6/28/17.
 */
public class isValidParentheses {
    public int isValid(String s) {
        int count = 0 ;
        Stack<Character> stack =new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{')
                stack.push(c);
            else if(c=='}' || c==')' || c==']')
            {
                if(stack.isEmpty())
                    return 0;
                else{
                    if(!isMatching(stack.peek(), c))
                        return 0;
                    else{
                        count++;
                        stack.pop();
                    }
                }
            }

        }
        if(stack.isEmpty()){
            return count;
        }
        else{
            return 0;
        }

    }

    public boolean isMatching(Character c, Character d){
        if(c=='{' && d=='}')
            return true;
        else if(c=='[' && d==']')
            return true;
        else if(c=='(' && d==')')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "]]";
        System.out.println(new isValidParentheses().isValid(s));
    }
}
