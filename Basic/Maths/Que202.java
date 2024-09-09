


//Question Link :- https://leetcode.com/problems/happy-number/description/?envType=problem-list-v2&envId=math



public class Solution {

    public static boolean isHappy(int n) {
        int[] seen = new int[1000];
        int index = 0;

        while (n != 1) {
            for (int i = 0; i < index; i++) {
                if (seen[i] == n) {
                    return false;
                }
            }
            seen[index++] = n;
            n = getSumOfSquares(n);
        }
        return true;
    }

    public static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
