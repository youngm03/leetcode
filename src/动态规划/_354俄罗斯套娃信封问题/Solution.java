package 动态规划._354俄罗斯套娃信封问题;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/9 20:31
 */
public class Solution {

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
            }
        });

        int nums[] = new int[envelopes.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = envelopes[i][1];
        }
        int dp[] = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = result;
            int value = nums[i];
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (dp[mid] > value) {
                    right = mid;
                } else if (dp[mid] < value) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            if (left == result) result++;
            dp[left] = value;
        }
        return result;
    }

}
