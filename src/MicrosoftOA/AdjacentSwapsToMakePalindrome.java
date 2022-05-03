package MicrosoftOA;
/*
Given a string, what is the minimum number of adjacent swaps required to convert a string into a palindrome.
If not possible, return -1.

Example 1:

Input: "mamad"
Output: 3
Example 2:

Input: "asflkj"
Output: -1
Example 3:

Input: "aabb"
Output: 2
Example 4:

Input: "ntiin"
Output: 1
Explanation: swap 't' with 'i' => "nitin"
 */
public class AdjacentSwapsToMakePalindrome {
    public static int adjacentSwapsToMakePalindrome(String s){
        if(s == null || s.length() == 0) return -1;
        int totalSwaps = 0;

        if(isShuffledPalindrome(s)) {
            char[] chars = s.toCharArray();
            int p1 = 0, p2 = chars.length - 1;

            while(p2 > p1) {
                if(chars[p1] != chars[p2]) {
                    int k = p2;
                    while(k > p1 && chars[k] != chars[p1]) {
                        k--;
                    }
                    if(k == p1) { // When no matching character found
                        swap(chars, p1, p1 + 1);
                        totalSwaps++;

                    } else { // When Matching character found swap until K reaches p2 position
                        while(k < p2) {
                            swap(chars, k, k + 1);
                            totalSwaps++;
                            k++;
                        }
                        p1++;
                        p2--;
                    }
                } else {
                    p1++;
                    p2--; //When the characters are equal move on
                }
            }
            return totalSwaps;
        }
        else return -1;
    }
    public static void swap(char[] cArr, int i, int j){
        char temp = cArr[i];
        cArr[i] = cArr[j];
        cArr[j] = temp;
    }
    public static boolean isShuffledPalindrome(String s){
        int[] occurence = new int[26];
        int oddCount = 0;
        for(int i =0; i<s.length(); i++){
            occurence[s.charAt(i)-'a']++;
        }
        for(int val: occurence){
            if(val%2!= 0){
                oddCount++;
            }
        }
        return oddCount<=1;
    }
    public static void main(String[] args){
        System.out.print("First String: "+ adjacentSwapsToMakePalindrome("mamad")+ "\n");
        System.out.print("Second String: "+ adjacentSwapsToMakePalindrome("asflkj")+ "\n");
        System.out.print("Third String: "+ adjacentSwapsToMakePalindrome("aabb")+ "\n");
        System.out.print("Fourth String: "+ adjacentSwapsToMakePalindrome("ntiin")+ "\n");
        System.out.print("Fifth String: "+ adjacentSwapsToMakePalindrome("isddhi")+ "\n");
    }
}
