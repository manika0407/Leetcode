package LinkedList;

/**
 * Created by manika on 6/20/17.
 *
 * Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;

        int getLength=getLength(head);
        if(getLength-n==0){
            head=head.next;
            return head;
        }
        ListNode cur=head;
        for(int i=0;i<getLength-n-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;

    }

    private int getLength(ListNode head) {
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        //ListNode f=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //e.next=f;
        ListNode x= new removeNthFromEnd().removeNthFromEnd(a,2);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);
        System.out.println(x.next.next.next.val);

    }
}
