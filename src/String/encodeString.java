package String;

/**
 * Created by manika on 7/7/17.
 Input

 aaaabbbccc
 abbbcdddd

 Output
 a4b3c3
 a1b3c1d4
 */
public class encodeString
{
    public String encode(String str)
    {
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int count =1;
            char c=str.charAt(i);
            res.append(c);
            i++;

            while(i<str.length() && str.charAt(i)==c){
                count++;
                i++;
            }
            res.append(count);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new encodeString().encode("abcddddef"));
    }
}
