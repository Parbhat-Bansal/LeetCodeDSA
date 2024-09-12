
//Question Link :- https://leetcode.com/problems/sort-colors/


class Solution {

    public void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
    public void sortColors(int[] nums) {
        int n = nums.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (nums[j] > nums[j + 1]) 
                {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) 
            {
                break; 
            }
        }
    }
    
    
}
