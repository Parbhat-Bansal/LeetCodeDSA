// Question Link :- https://leetcode.com/problems/find-peak-element/submissions/1426445897/?envType=problem-list-v2&envId=binary-search

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = nums[0];

        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i] ;
            }
        }
        int j = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == max)
            {
                j = i ; ;
            }
        }
        return j;
    }
}