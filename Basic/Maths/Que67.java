
// Question Link :- https://leetcode.com/problems/add-binary/

class Solution {
    public String addBinary(String a, String b) {
         int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result = (sum % 2) + result;
            carry = sum / 2;
        }

        return result;
        
    }
}