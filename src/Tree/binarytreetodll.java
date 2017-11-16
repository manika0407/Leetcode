package Tree;

public class binarytreetodll {
  TreeNode root;

  public static TreeNode binarytree2ListUtil(TreeNode node){
    if(node==null){
      return node;
    }
    if(node.left!=null){
      TreeNode left = binarytree2ListUtil(node.left);

      for(;left.right!=null;left=left.right);

      left.right=node;

      node.left=left;
    }

    if(node.right!=null){
      TreeNode right = binarytree2ListUtil(node.right);


      for(;right.left!=null;right=right.left);
      right.left=node;
      node.right=right;
  }

  return node;
}

  public static TreeNode binaryTree2List(TreeNode node){
    if(node==null){
      return node;
    }

    node=binarytree2ListUtil(node);

    while(node.left!=null){
      node=node.left;
    }

    return node;
  }

  public static void main(String[] args) {
    TreeNode tree = new TreeNode(10);

    // Let us create the tree shown in above diagram
    tree.left = new TreeNode(12);
    tree.right = new TreeNode(15);
    tree.left.left = new TreeNode(25);
    tree.left.right = new TreeNode(30);
    tree.right.left = new TreeNode(36);

    // Convert to DLL
    TreeNode head = binaryTree2List(tree);

  }
  }
