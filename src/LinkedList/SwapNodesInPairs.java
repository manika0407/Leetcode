package LinkedList;

/**
 * Created by manika on 6/20/17.
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode NextNode=head.next;
        head.next=swapPairs(head.next.next);
        NextNode.next=head;
        return NextNode;
    }
}
