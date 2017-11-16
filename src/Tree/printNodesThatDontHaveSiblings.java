package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class printNodesThatDontHaveSiblings {

  public List<TreeNode> nodesWithNoSibling(TreeNode root){
    List<TreeNode> result = new ArrayList<>();
    if(root==null){
      return result;
    }
    backtrack(result, root);
    return result;
  }

  private void backtrack(List<TreeNode> result, TreeNode root) {
    if(root==null){
      return;
    }
    if(root.left!=null && root.right!=null){
      backtrack(result, root.left);
      backtrack(result,root.right);
    } else if(root.left!=null){
      result.add(root.left);
      backtrack(result, root.left);
    } else if(root.right!=null){
      result.add(root.right);
      backtrack(result, root.right);
    }


  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.right=new TreeNode(4);
    root.right.left=new TreeNode(5);
    root.right.left.right = new TreeNode(6);
    List<TreeNode> result = new printNodesThatDontHaveSiblings().nodesWithNoSibling(root);
    for(TreeNode t: result){
      System.out.println(t.val);
    }
  }
}
