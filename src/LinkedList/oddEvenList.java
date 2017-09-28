package LinkedList;

/**
 * Created by manika on 5/23/17.
 */
public class oddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd=head,even=head.next,evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }


        public static void main(String[] args) {
            ListNode a=new ListNode(3);
        ListNode b=new ListNode(4);
        ListNode c=new ListNode(7);
        a.next=b;
        b.next=c;
            ListNode d=new ListNode(2);
            ListNode e=new ListNode(3);
        ListNode f=new ListNode(7);
        ListNode g=new ListNode(7);
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(new oddEvenList().oddEvenList(a));
        }
}

