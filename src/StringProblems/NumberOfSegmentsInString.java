package StringProblems;
/*
Count the number of segments in a string, where a segment is defined
to be a contiguous sequence of non-space characters.
Please note that the string does not contain any non-printable characters.
 */
public class NumberOfSegmentsInString {
    public int countSegments(String s){
        if(s== null || s.length()==0){
            return 0;
        }
        String segment = s.trim();
        System.out.println(segment);
        if(segment.equals("")){
            return 0;
        }
        return segment.split("\\s+").length;
    }
    public static void main(String[] args){
        NumberOfSegmentsInString obj = new NumberOfSegmentsInString();
        System.out.println(obj.countSegments("Hello, I am Priyanshi Jajoo"));
    }
}
