package LinkedList;

/**
 * Not solved yet
 *
 *
 * Created by manika on 6/22/17.
 */
public class reverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode pre1=null,cur1=dummyNode;
        for(int i = 0; i<m; i++) {
            pre1 = cur1;
            cur1 = cur1.next;
        }

        ListNode cur2=cur1;
        ListNode pre2=pre1;
        ListNode next;
        for(int i=m;i<=n;i++){
            next=cur2.next;
            cur2.next=pre2;
            pre2=cur2;
            cur2=next;
        }

    pre1.next=pre2;
        cur1.next=cur2;
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        //ListNode f=new ListNode(5);
        //ListNode g=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ListNode x=new reverseLinkedList2().reverseBetween(a, 2,3);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);
        System.out.println(x.next.next.next.val);
        System.out.println(x.next.next.next.next.val);
    }


}
