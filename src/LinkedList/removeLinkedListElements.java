package LinkedList;

/**
 * Created by manika on 6/18/17.
 */
public class removeLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
       if(head==null){
           return null;
       }
        if(val==head.val){
           return removeElements(head.next,val);
       }
       else{
           head.next=removeElements(head.next,val);
           return head;
       }
    }
}
