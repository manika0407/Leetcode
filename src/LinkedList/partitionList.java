package LinkedList;

/**
 * Created by manika on 6/22/17.
 *
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

 You should preserve the original relative order of the nodes in each of the two partitions.

 For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
 */
public class partitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0), dummy2=new ListNode(0);
        ListNode cur=head;
        ListNode p1=dummy1;
        ListNode p2=dummy2;
        while(cur!=null){
            if(cur.val<x){
                p1.next=cur;
                p1=cur;
            }
            else{
                p2.next=cur;
                p2=cur;
            }
            cur=cur.next;
        }
        p2.next=null;
        p1.next=dummy2.next;


      return dummy1.next;
    }




    public static void main(String[] args) {
        ListNode a=new ListNode(1);
       ListNode b=new ListNode(4);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(2);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        ListNode x=new partitionList().partition(a,3);
        System.out.println(x.val);
      System.out.println(x.next.val);
        System.out.println(x.next.next.val);
        System.out.println(x.next.next.next.val);
        System.out.println(x.next.next.next.next.val);
        System.out.println(x.next.next.next.next.next.val);



    }
}
