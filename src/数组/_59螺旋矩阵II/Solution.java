package 数组._59螺旋矩阵II;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/5 22:00
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int up = 0, right = n - 1, left = 0, down = n - 1;
        while (num <= n * n) {
            if (up <= down) {
                for (int i = left; i <= right; i++) {
                    result[up][i] = num;
                    num++;
                }
                up++;
            }
            if (left <= right) {
                for (int i = up; i <= down; i++) {
                    result[i][right] = num;
                    num++;
                }
                right--;
            }
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    result[down][i] = num;
                    num++;
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    result[i][left] = num;
                    num++;
                }
                left++;
            }
        }
        return result;
    }

}
