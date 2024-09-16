

// Question Link :- https://leetcode.com/problems/move-zeroes/?envType=problem-list-v2&envId=array


class Solution {
    public void moveZeroes(int[] nums) 
    {
        int lastNonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) 
            {
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                lastNonZeroIndex++;
            }
        }
    }
}
