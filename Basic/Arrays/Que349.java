class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        int[] tempResult = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        

        while (i < nums1.length && j < nums2.length) 
        {
            if (nums1[i] < nums2[j]) 
            {
                i++;
            } 
            
            else if (nums1[i] > nums2[j]) 
            {
                j++;
            } 
            
            else 
            {
                
                if (index == 0 || tempResult[index - 1] != nums1[i]) 
                {
                    tempResult[index++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        
        
        int[] result = new int[index];
        System.arraycopy(tempResult, 0, result, 0, index);
        
        return result;
    }
    
}