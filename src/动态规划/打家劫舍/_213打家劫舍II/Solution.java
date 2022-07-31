package 动态规划.打家劫舍._213打家劫舍II;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/31 23:19
 */
public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(dp(nums, 0, nums.length - 2), dp(nums, 1, nums.length - 1));
    }

    private int dp(int[] nums, int start, int end) {
        int dp_i = 0, dp_1 = 0, dp_2 = 0;
        for (int i = end; i >= start; i--) {
            dp_i = Math.max(dp_1, dp_2 + nums[i]);
            dp_2 = dp_1;
            dp_1 = dp_i;
        }
        return dp_i;

    }

}
