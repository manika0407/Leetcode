package Array;

/**
 * Created by manika on 4/17/17.
 */
public class almostIncreasingSequence {
    public static boolean almostIncreasingSequence(int[] sequence) {
        int count=0;
        for(int i=1;i<sequence.length;i++){
            if(sequence[i-1]>=sequence[i])
                count++;
        }
        if(count==0 || count==1)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] sequence={1,2,1,2};
        System.out.println(almostIncreasingSequence(sequence));
    }
}
