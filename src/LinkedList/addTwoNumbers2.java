package LinkedList;

/**
 * Created by manika on 6/23/17.
 */
public class addTwoNumbers2 {
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode list1=reverseList(l1);
        ListNode list2=reverseList(l2);
        ListNode x= addTwoNumbersFun(list1,list2);
        ListNode res=reverseList(x);
        return res;
    }

    private ListNode addTwoNumbersFun(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;
        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
        if(carry==1)
            p3.next=new ListNode(1);

        return newHead.next;
    }

    public  ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        ListNode a=new ListNode(7);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(4);
        a.next=b;
        b.next=c;
        c.next=d;

        e.next=f;
        f.next=g;

        ListNode res=new addTwoNumbers2().addTwoNumbers2(a,e);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);
    }
}
