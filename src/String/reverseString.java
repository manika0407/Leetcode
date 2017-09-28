package String;

/**
 * Created by manika on 4/2/17.
 */
public class reverseString {
    public String reverseString(String s){
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
