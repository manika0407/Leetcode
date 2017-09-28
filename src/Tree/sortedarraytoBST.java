package Tree;

/**
 * Created by manika on 2/8/17.
 */
public class sortedarraytoBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums, int i, int j){
        if(i>j) return null;
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(nums,i,mid-1);
        root.right=sortedArrayToBST(nums,mid+1,j);
        return root;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,7,9};
        System.out.println(new sortedarraytoBST().sortedArrayToBST(arr).val);

    }
}
