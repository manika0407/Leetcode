package Tree;


import java.util.Stack;

/**
 * Created by manika on 3/2/17.
 */
public class inorderWORecursion {
    public void inorder(TreeNode a){
        if(a==null) return ;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode node=a;
        while(node!=null){
            stack.push(node);
            node=node.getLeft();
        }
        while(stack.size()>0){
            node=stack.pop();
            System.out.print(node.val+" ");
            if(node.right!=null){
                node=node.getRight();

                while(node!=null){
                    stack.push(node);
                    node=node.left;
                }
            }
        }
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
        inorderWORecursion ins = new inorderWORecursion();
        ins.inorder(a);
    }
}
