package 股票买卖._123买卖股票的最佳时机III;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/31 14:33
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int dp[][][] = new int[prices.length][3][2];
        int maxNum = 2;
        for (int i = 0; i < prices.length; i++) {
            for (int k = maxNum; k >= 1; k--) {
                if (i - 1 == -1) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][2][0];
    }

}
