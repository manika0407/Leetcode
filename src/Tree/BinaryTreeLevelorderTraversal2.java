package Tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by manika on 2/7/17.
 */
public class BinaryTreeLevelorderTraversal2 {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null) return result;
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        current.offer(root);
        ArrayList<Integer> numberlist = new ArrayList<Integer>();
        while (!current.isEmpty()) {
            TreeNode head = current.poll();
            numberlist.add(head.val);

            if (head.left != null) next.offer(head.left);
            if (head.right != null) next.offer(head.right);

            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<TreeNode>();
                result.add(numberlist);
                numberlist = new ArrayList<Integer>();

            }
        }
        ArrayList<ArrayList<Integer>> reversedResult = new ArrayList<ArrayList<Integer>>();
        for (int i = result.size() - 1; i >= 0; i--) {
            reversedResult.add(result.get(i));
        }
        return reversedResult;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(10);
        TreeNode e = new TreeNode(12);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(17);
        a.setLeft(b);
        a.setRight(c);
        c.setLeft(d);
        c.setRight(e);
        d.setLeft(f);
        d.setRight(g);
        BinaryTreeLevelorderTraversal2 ins = new BinaryTreeLevelorderTraversal2();
        System.out.println(ins.levelOrderBottom(a));
    }
}
