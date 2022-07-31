package 股票买卖._121买卖股票的最佳时机;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/31 11:37
 */
public class Solution {

    /**
     * 状态转移方程：
     * dp[i][k][0 or 1]: i代表天数，k代表最大交易次数，0 or 1表示是否持有股票
     * dp[i][k][0] = Max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i])
     * dp[i][k][1] = Max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i])
     *
     * 当 k = 0时，dp[i][0][0] = 0, dp[i][0][1] = Integer.MinValue;
     * 当 i = -1时，dp[-1][k][0] = 0, dp[-1][k][1] = Integer.MinValue;
     *
     * 本题的k为固定值：1, 代入方程：
     * dp[i][1][0] = Max(dp[i - 1][1][0], dp[i - 1][1][1] + prices[i])
     * dp[i][1][1] = Max(dp[i - 1][1][1], dp[i - 1][0][0] - prices[i])
     * k都为1，则可以将状态转移方程化简为：
     * dp[i][0] = Max(dp[i - 1][0], dp[i - 1][1] + prices[i])
     * dp[i][1] = Max(dp[i - 1][1], 0 - prices[i])
     *
     * 当k = 0时，列出baseCase：
     * dp[0][0] = Max(dp[-1][0], dp[-1][1] + prices[i]) = Max(0, Integer.MinValue + prices[i]) = 0;
     * dp[0][1] = Max(dp[-1][1], dp[-1][0] - prices[i]) = Max(Integer.MinValue, 0 - prices[i]) = -prices[i];
     */

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            if ( i == 0) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

}
