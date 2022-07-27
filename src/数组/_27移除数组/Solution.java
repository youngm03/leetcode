package 数组._27移除数组;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/27 20:49
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow++;
    }
}
