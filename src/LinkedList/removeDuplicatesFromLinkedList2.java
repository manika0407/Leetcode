package LinkedList;

/**
 * Created by manika on 6/23/17.
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.
 */
public class removeDuplicatesFromLinkedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        ListNode cur=head;
        dummyNode.next=head;
        ListNode pre=dummyNode;

        while(cur!=null){
            while(cur.next!=null && cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur)
                pre=pre.next;
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(5);
        ListNode d=new ListNode(5);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(5);
        ListNode g=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        ListNode x=new removeDuplicatesFromLinkedList2().deleteDuplicates(a);
       System.out.println(x.val);
//        System.out.println(x.next.val);
//        System.out.println(x.next.next.val);
    }
}
