package 数组._48旋转图像;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/5 20:27
 */
public class Solution {

    public void rotate(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}
