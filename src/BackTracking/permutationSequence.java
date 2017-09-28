package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 */
public class permutationSequence {
    public String permute(int n, int k) {
        List<String> allPermutations =new ArrayList<String>();
        StringBuilder curPermutation = new StringBuilder();
        boolean[] added=new boolean[n];
        permute(allPermutations, curPermutation, n, 1,  added);
        String res=allPermutations.get(k-1);
        System.out.println(allPermutations);
        return res;
    }

    private void permute(List<String> allPermutations, StringBuilder curPermutation, int n, int x, boolean[] added) {
        if(curPermutation.length()==n)
        {
            allPermutations.add(curPermutation.toString());

        }
        else {
            for (int i = 1; i <=n; i++) {
                if(added[i]) continue;
                curPermutation=curPermutation.append(i);
                added[i]=true;
                permute(allPermutations, curPermutation,n,  i+1, added);
                added[i] = false;
                curPermutation.deleteCharAt(curPermutation.length()-1);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(new permutationSequence().permute(3, 3));
    }

}
