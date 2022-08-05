package 数组._54螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/5 21:49
 */
public class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int up = 0, right = n - 1, left = 0, down = m - 1;
        while (result.size() < m * n) {
            if (up <= down) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[up][i]);
                }
                up++;
            }
            if (left <= right) {
                for (int i = up; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

}
