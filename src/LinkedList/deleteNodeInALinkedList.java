package LinkedList;

/**
 * Created by manika on 6/29/17.
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class deleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
     ListNode nextNode=node.next;
     node.val=nextNode.val;
     node.next=nextNode.next;
    }
}
