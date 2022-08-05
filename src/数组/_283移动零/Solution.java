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
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                int index = left;
                for (int j = index; j >= 1; j--) {
                    if (nums[j] > nums[j - 1]) {
                        break;
                    }
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                left++;
            }
            right++;
        }
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 2, 0, 4, 0, 1};
        new Solution().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
