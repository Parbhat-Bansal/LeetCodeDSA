

// Question Link :- https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int A = 0;
        int B = m;
        int C = 0;
        int D = n;

        while (A <= B && C <= D) {
            for (int i = C; i <= D; i++) {
                result.add(matrix[A][i]);
            }
            A++;

            for (int i = A; i <= B; i++) {
                result.add(matrix[i][D]);
            }
            D--;

            if (A <= B) {
                for (int i = D; i >= C; i--) {
                    result.add(matrix[B][i]);
                }
                B--;
            }

            if (C <= D) {
                for (int i = B; i >= A; i--) {
                    result.add(matrix[i][C]);
                }
                C++;
            }
        }

        return result;
    }
}
  
   