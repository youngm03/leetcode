package 动态规划.打家劫舍._198打家劫舍;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/31 23:15
 */
public class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 2];
        int dp_i = 0, dp_1 = 0, dp_2 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            dp_i = Math.max(dp_1, nums[i] + dp_2);
            dp_2 = dp_1;
            dp_1 = dp_i;
        }
        return dp_i;
    }

}
