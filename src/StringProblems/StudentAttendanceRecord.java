package StringProblems;
/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
 */

public class StudentAttendanceRecord {
    public boolean studentReward(String s){
        if(s.length()<2) {
            return true;
        }
        int countA=0;
        int countL=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                countA++;
                if(countA>1){
                    return false;
                }
            }
            if(s.charAt(i)!='L'){
                countL=0;
            }if(s.charAt(i)=='L'){
                countL++;
                if(countL>2){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        StudentAttendanceRecord obj = new StudentAttendanceRecord();
        String s="LALL";
        System.out.println(obj.studentReward(s));
    }
}
