package LinkedList;

/**
 * Created by manika on 5/23/17.
 */


public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=getLength(headA);
        int lengthB=getLength(headB);

        int diff=lengthA-lengthB;
        if(diff>0)
        {
          while(diff>0){
              headA=headA.next;
              diff--;
          }
        }
        if(diff<0){
            diff=-diff;
            while(diff>0){
                headB=headB.next;
                diff--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA.val==headB.val)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    private int getLength(ListNode headA) {
        int len=0;
        while(headA!=null){
            len++;
            headA=headA.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(3);
//        ListNode b=new ListNode(4);
//        ListNode c=new ListNode(7);
//        a.next=b;
//        b.next=c;
        ListNode d=new ListNode(2);
        ListNode e=new ListNode(3);
//        ListNode f=new ListNode(7);
//        ListNode g=new ListNode(7);
//        d.next=e;
//        e.next=f;
//
        d.next=e;
        System.out.println(new getIntersectionNode().getIntersectionNode(a,d));
    }
}
