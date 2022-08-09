package 动态规划._300最长递增子序列;

import java.util.Arrays;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/9 20:11
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j>= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int result = 1;
        for (int i : dp) {
            result = Math.max(result, i);
        }
        return result;
    }

}
