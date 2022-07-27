package 数组._283移动零;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/27 20:58
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
