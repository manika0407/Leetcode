package Tree;

/**
 * Created by manika on 2/6/17.
 */
public class findMax {
    public static int findMax(TreeNode root){
        int root_val,left,right, max=Integer.MIN_VALUE;
        if(root!=null){
            root_val=root.getval();
            left=findMax(root.getLeft());
            right=findMax(root.getRight());
            if(left<right){
                max=right;
            }
            else{
                max=left;
            }
            if(root_val>max){
                max=root_val;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        TreeNode b=new TreeNode(2);
        TreeNode left=new TreeNode(3);
        TreeNode right=new TreeNode(4);

        b.setLeft(left);
        b.setRight(right);
        System.out.println(findMax(b));
    }
}
