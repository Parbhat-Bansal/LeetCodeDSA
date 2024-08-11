

// Question Link :- https://leetcode.com/problems/first-missing-positive/description/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length ;

        for(int i = 0 ; i < n ; i ++)
        {
            if(nums[i] <= 0 || nums[i] > n)
            {
                nums[i] = n + 1 ;
            }
        }

        for(int i = 0 ; i < n ; i ++)
        {
            int P = Math.abs(nums[i]) ;
            if(P > n)
            {
                continue ;
            }
            P-- ;
            if(nums[P] > 0 )
            {
                nums[P] = - nums[P] ;
            }
        }

        for(int i = 0 ; i < n ; i ++)
        {
            if(nums[i] > 0)
            {
                return i +1 ; 
            }
        }

        return n+1 ;
    }
}