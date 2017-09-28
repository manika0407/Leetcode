package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by manika on 2/8/17.
 */
public class preordertraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            result.add(node.getval());
             if(node.getRight()!=null)
                 stack.push(node.getRight());
             if(node.left!=null)
                 stack.push(node.getLeft());
        }
        return result;
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

        System.out.println(new preordertraversal().preorderTraversal(a));
    }
}
