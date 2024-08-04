
// Question Link :- https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
         int length = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && length > 0) {
                break;
            }
            if (s.charAt(i) != ' ') {
                length++;
            }
        }
        return length;
    }
        
}