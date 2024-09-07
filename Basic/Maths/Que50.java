
//Question links ;- https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, long n) {
        
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1;
        double base = x;

        while (n > 0) {
            if (n % 2 == 1) 
            {
                result *= base;
            }
            base *= base; 
            n /= 2; 
        }

        return result;
    }
}
