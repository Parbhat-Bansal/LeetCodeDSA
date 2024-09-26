
//Question Link :- https://leetcode.com/problems/search-a-2d-matrix/

class Soln {
    public boolean searchMatrix(int[][] matrix, int target) {
         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) 
        {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;       
        int col = n - 1;   

        while (row < m && col >= 0) 
        {
            int current = matrix[row][col];

            if (current == target) 
            {
                return true;
            } 

            else if (current > target) 
            {
                col--; 
            } 
            
            else 
            {
                row++; 
            }
        }

        return false;
        
    }
}