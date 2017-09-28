package Tree;

/**
 * Created by manika on 6/28/17.
 * Problem Definition
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

 The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

 Example 1:
 Input: Binary tree: [1,2,3,4]
 1
 /   \
 2     3
 /
 4

 Output: "1(2(4))(3)"

 Explanation: Originallay it needs to be "1(2(4)())(3()())",
 but you need to omit all the unnecessary empty parenthesis pairs.
 And it will be "1(2(4))(3)".
 Example 2:
 Input: Binary tree: [1,2,3,null,4]
 1
 /   \
 2     3
 \
 4

 Output: "1(2()(4))(3)"

 Explanation: Almost the same as the first example,
 except we can't omit the first parenthesis pair to break the one-to-one mapping relatio
 */
public class constructStringFromBST {
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        String result=t.val+"";
        String left=tree2str(t.left);
        String right=tree2str(t.right);
        if (left == "" && right == "") return result;
        if (left == "") return result + "()" + "(" + right + ")";
        if(right=="") return result+"("+left+")";
        return result+"("+left+")"+"("+right+")";
    }



    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);

        a.left=b;
        a.right=c;
        a.left.right=d;

    }
}
