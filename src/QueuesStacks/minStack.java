package QueuesStacks;

import java.util.Stack;

/**
 * Created by manika on 7/17/17.
 */
public class minStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
        public minStack() {

    }

    public void push(int x) {
        if(x <= min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.peek()==min) {
            stack.pop();
            min=stack.pop();
        }
        else
            stack.pop();
    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {
        return min;
    }

}
