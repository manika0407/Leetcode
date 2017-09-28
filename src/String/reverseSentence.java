package String;

/**
 * Created by manika on 4/17/17.
 */
public class reverseSentence {
    public static void main(String[] args) {
        String str="I Hate Spaces";
        System.out.println(ReverseSentence(str));
    }

    private static String ReverseSentence(String str) {
        String result = "";
        String x=reverseString(str);
        String[] parts=x.split(" ");
        for(int i=0;i<parts.length;i++)
        {
            result+=reverseString(parts[i]);
            result+=" ";
        }
        return result;

    }
    public static String reverseString(String s){
        char[] in=s.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp=in[begin];
            in[begin]=in[end];
            in[end]=temp;
            end--;
            begin++;
        }
        return new String(in);
    }


}
