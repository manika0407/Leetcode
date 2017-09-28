package String;

/**
 * Created by manika on 7/5/17.
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class reversewords3 {
    public String reverseWords(String s) {
        String[] strArray=s.split(" ");
        //If we use String instead of StringBuilder , Leetcode gives "Time Limit Exceeded" error.
        StringBuilder str=new StringBuilder();
        for(int i=0;i<strArray.length;i++){
            str.append(reverseString(strArray[i]));
            if(i!=strArray.length-1)
                str.append(" ");
        }
    return str.toString();
    }

    public String reverseString(String s) {
        char[] in = s.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(new reversewords3().reverseWords(s));
    }

}
