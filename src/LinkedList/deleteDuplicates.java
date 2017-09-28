package LinkedList;

/**
 * Created by manika on 6/20/17.
 */
public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode cur=head;
        while(cur!=null){
            if(cur.next==null) break;
            if(cur.val==cur.next.val)
                cur.next=cur.next.next;
            else
                cur=cur.next;
        }
    return head;
    }
}
