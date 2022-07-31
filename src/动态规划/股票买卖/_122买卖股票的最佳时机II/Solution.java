package 动态规划.股票买卖._122买卖股票的最佳时机II;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/31 12:10
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

}
