package LinkedList;

/**
 * Created by manika on 4/8/17.
 */

class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  class TreeNode{
      int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
  }

public class reverseList {
    public static ListNode reverseList(ListNode head) {
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
        ListNode x=new reverseList().reverseList(a);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);
        System.out.println(x.next.next.next.val);
        System.out.println(x.next.next.next.next.val);
        System.out.println(x.next.next.next.next.next.val);



    }
}

