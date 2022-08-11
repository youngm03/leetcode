package 动态规划._53最大子数组和;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/11 22:41
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        int result = Integer.MIN_VALUE;
        for (int i : dp) {
            result = result > i ? result : i;
        }
        return result;
    }

}
