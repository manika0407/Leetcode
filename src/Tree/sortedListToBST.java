package Tree;

/**
 * Created by manika on 4/23/17.
 */
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
  }

  public class sortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        int length=getLength(head);
        return sortedListToBST(head,0,length-1);
    }

      private TreeNode sortedListToBST(ListNode head, int start, int end) {
        if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode left=sortedListToBST(head,0,mid-1);
        TreeNode root=new TreeNode(head.val);
        head=head.next;
        TreeNode right=sortedListToBST(head,0,mid-1);
        root.left=root;
        root.right=root;
        return root;

      }

      private int getLength(ListNode head) {
        int len=0;
        while(head!=null)
        {
            head=head.next;
            len++;
        }
        return len;
      }
  }
