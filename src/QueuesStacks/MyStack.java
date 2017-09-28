package QueuesStacks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manika on 6/27/17.
 */
public class MyStack {
    Queue<Integer> queue1=new LinkedList<Integer>();
    Queue<Integer> queue2=new LinkedList<Integer>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        while(!queue1.isEmpty())
            queue2.offer(queue1.poll());

        queue1.offer(x);
        while(!queue2.isEmpty())
            queue1.offer(queue2.poll());

        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        if(!queue1.isEmpty())
        return queue1.poll();

        return 0;

    }

    /** Get the top element. */
    public int top() {

return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
return (queue1.isEmpty());
    }
}
