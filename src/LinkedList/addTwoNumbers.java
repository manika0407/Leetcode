package LinkedList;

/**
 * Created by manika on 6/20/17.
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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

    public static void main(String[] args) {

        ListNode a=new ListNode(2);
        ListNode b=new ListNode(4);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(5);
        ListNode e=new ListNode(6);
        ListNode f=new ListNode(4);
        a.next=b;
        b.next=c;
        d.next=e;
        e.next=f;
        ListNode x=new addTwoNumbers().addTwoNumbers(a,d);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);
    }

}

