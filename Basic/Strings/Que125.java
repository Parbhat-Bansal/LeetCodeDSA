
// Question link :- https://leetcode.com/problems/valid-palindrome/?envType=problem-list-v2&envId=string

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move the left pointer to the next alphanumeric character
            while (left < right) {
                char leftChar = s.charAt(left);
                if ((leftChar >= 'A' && leftChar <= 'Z') || 
                    (leftChar >= 'a' && leftChar <= 'z') || 
                    (leftChar >= '0' && leftChar <= '9')) {
                    break; // Found an alphanumeric character
                }
                left++; // Move left pointer
            }

            // Move the right pointer to the previous alphanumeric character
            while (left < right) {
                char rightChar = s.charAt(right);
                if ((rightChar >= 'A' && rightChar <= 'Z') || 
                    (rightChar >= 'a' && rightChar <= 'z') || 
                    (rightChar >= '0' && rightChar <= '9')) {
                    break; // Found an alphanumeric character
                }
                right--; // Move right pointer
            }

            // Compare characters (convert to lowercase without using built-in functions)
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (leftChar >= 'A' && leftChar <= 'Z') {
                leftChar += 32; // Convert to lowercase
            }
            if (rightChar >= 'A' && rightChar <= 'Z') {
                rightChar += 32; // Convert to lowercase
            }

            if (leftChar != rightChar) {
                return false; // Not a palindrome
            }

            left++;
            right--;
        }
        return true; // It is a palindrome
    }
         
}