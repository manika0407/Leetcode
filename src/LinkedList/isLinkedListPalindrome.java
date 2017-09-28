package LinkedList;

/**
 * Created by manika on 5/23/17.
 */
public class isLinkedListPalindrome {
    public static boolean isPalindrome(ListNode head) {
       ListNode fast=head,slow=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       //This will work in linked list of odd length
       if(fast!=null)
           slow=slow.next;
       slow=reverseList.reverseList(slow);
       fast=head;
       while(slow!=null){
           if(fast.val!=slow.val){
               return false;
           }
           slow=slow.next;
           fast=fast.next;
       }
       return true;
    }


    public static void main(String[] args) {
        ListNode a=new ListNode(2);
          ListNode b=new ListNode(3);
          ListNode c=new ListNode(4);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(3);
        ListNode f=new ListNode(2);
          a.next=b;
          b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(new isLinkedListPalindrome().isPalindrome(a));
    }
}
