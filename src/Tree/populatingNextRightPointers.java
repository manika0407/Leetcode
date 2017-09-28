package Tree;

/**
 * Created by manika on 7/10/17.
 */

class TreeLinkNode {
    int val;
     TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }

  public class populatingNextRightPointers {
    public void connect(TreeLinkNode root) {
        while(root!=null && root.left!=null){
            TreeLinkNode nextNode=root.left;
            while(root!=null){
                root.left.next=root.right;
                root.right.next=(root.next==null)?null:root.next.left;
                root=root.next;

            }
            root=nextNode;
        }

    }
}
