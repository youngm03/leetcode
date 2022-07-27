package 数组._26删除有序数组中的重复项;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/27 20:45
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

}
