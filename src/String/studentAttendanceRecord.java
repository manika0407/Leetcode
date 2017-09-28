package String;

/**
 * Created by manika on 7/11/17.
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:

 'A' : Absent.
 'L' : Late.
 'P' : Present.
 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

 You need to return whether the student could be rewarded according to his attendance record.

 Example 1:
 Input: "PPALLP"
 Output: True
 Example 2:
 Input: "PPALLL"
 Output: False
 */
public class studentAttendanceRecord {
    public boolean checkRecord(String s) {
        int countA=0;
        for(char c: s.toCharArray()){
            if(c=='A') countA++;
        }
        if (countA>1 || s.contains("LLL") )
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String str="PPALLPPL";
        System.out.println(new studentAttendanceRecord().checkRecord(str));
    }
}
