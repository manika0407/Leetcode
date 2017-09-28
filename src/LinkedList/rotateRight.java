package LinkedList;

/**
 * Created by manika on 6/20/17.
 */
public class rotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int getLength=getLength(head);
        if(getLength==k) return head;
        ListNode end=head;
        k=k%getLength;
        //System.out.println(getLength);
        ListNode nK=head;
        for(int i=1;i<getLength-k;i++){
            nK= nK.next;
        }


        while(end.next!=null){
            end=end.next;
        }
        end.next=head;
        ListNode newHead=nK.next;
        nK.next=null;
        head=newHead;

        return head;
    }

    public int getLength(ListNode head) {
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
//        ListNode d=new ListNode(4);
//        ListNode e=new ListNode(5);
        //ListNode f=new ListNode(2);
        a.next=b;
      b.next=c;
//        c.next=d;
//        d.next=e;
        //e.next=f;
        ListNode x= new rotateRight().rotateRight(a,4);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);
    }

}
