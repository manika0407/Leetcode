package LinkedList;

/**
 * Created by manika on 6/20/17.
 Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5

 */
public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode cur=head;

        while(cur!=null && cur.next!=null){
            if(cur.next.val==val) cur.next=cur.next.next;
            else
                cur=cur.next;
        }
        return head;
    }
}
