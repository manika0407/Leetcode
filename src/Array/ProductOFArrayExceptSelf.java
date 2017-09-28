package Array;

/**
 * Created by manika on 9/6/17.
 */
public class ProductOFArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int product=1;
        for(int i=0;i<result.length;i++)
        {
            result[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=result.length-1; i>=0;i--){
            result[i]*=product;
            product*=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result={2,3,1,5};
        int[] ans=new int[result.length];
        ans=new ProductOFArrayExceptSelf().productExceptSelf(result);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        System.out.println(ans[2]);
        System.out.println(ans[3]);
    }
}
