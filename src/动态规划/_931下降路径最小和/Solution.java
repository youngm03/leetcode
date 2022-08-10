import java.util.Arrays;

class Solution {

    public int minFallingPathSum(int[][] matrix) {
        int result = Integer.MAX_VALUE;
        memo = new int[matrix.length][matrix.length];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], 66666);
        }
        for (int j = 0; j < matrix[0].length; j++) {
            result = Math.min(result, dp(matrix, matrix.length - 1, j));
        }
        return result;
    }
    int memo[][];
    private int dp(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return 99999;
        }
        if (i == 0) {
            return matrix[i][j];
        }
        if (memo[i][j] != 66666) {
            return memo[i][j];
        }
        memo[i][j] = matrix[i][j] + Math.min(dp(matrix, i - 1, j), Math.min(dp(matrix, i - 1, j - 1), dp(matrix, i - 1, j + 1)));
        return memo[i][j];
    }

}
