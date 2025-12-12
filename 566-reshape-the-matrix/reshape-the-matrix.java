class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int m = mat.length;
        int n = mat[0].length;

        // Total elements must match
        if (m * n != r * c) {
            return mat; // Reshape not possible
        }

        int[][] res = new int[r][c];

        int row = 0;
        int col = 0;

        // Put elements into the new matrix in row order
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                res[row][col] = mat[i][j];
                col++;

                // If current row is filled, move to next row
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return res;
    }
}