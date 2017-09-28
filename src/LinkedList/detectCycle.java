package LinkedList;

/**
 * Created by manika on 6/18/17.
 * Problem Description:  Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=null, fast=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                while(head!=slow){
                    head=head.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(4);
        ListNode c=new ListNode(5);
        ListNode d=new ListNode(6);
        ListNode e=new ListNode(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c;
        System.out.println(new detectCycle().detectCycle(a));
    }

}
