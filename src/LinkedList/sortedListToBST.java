package LinkedList;

/**
 * Created by manika on 6/20/17.
 *
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class sortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return sortedListToBST(head,null);
    }

    private TreeNode sortedListToBST(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==tail) return null;

        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode newHead=new TreeNode(slow.val);
        newHead.left=sortedListToBST(head, slow);
        newHead.right=sortedListToBST(slow.next, tail);
        return newHead;
    }


}
