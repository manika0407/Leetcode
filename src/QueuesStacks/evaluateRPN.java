package QueuesStacks;

import java.util.Stack;

/**
 * Created by manika on 7/17/17.
 */
public class evaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        for(String s: tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            }
            else if(s.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else if(s.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] s={"18","12", "+","10","+"};
        System.out.println(new evaluateRPN().evalRPN(s));
    }
}
