package LinkedList;

/**
 * Created by manika on 6/22/17.
 Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You must do this in-place without altering the nodes' values.

 For example,
 Given {1,2,3,4}, reorder it to {1,4,2,3}.

 */
public class reorderList {
    public void reorderList(ListNode head) {
        if(head!=null && head.next!=null) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode second=slow.next;
            //break linked list to 2 equal parts
            slow.next=null;

            second=reverseOrder(second);

            ListNode p1=head;
            ListNode p2=second;
            while(p2!=null){
                ListNode node1=p1.next;
                ListNode node2=p2.next;
                p1.next=p2;
                p2.next=node1;

                p1=node1;
                p2=node2;

            }
        }
    }

    private ListNode reverseOrder(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode pre=head;
        ListNode curr=head.next;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head.next=null;
    return pre;
    }

}
