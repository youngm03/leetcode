package 排序.快排;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 1:37
 */
public class Solution {

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = partition(nums, left, right);
        sort(nums, left, p - 1);
        sort(nums, p + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int num = nums[left];
        int i = left + 1;
        int j = right;
        while (i < j) {
            while (j > left && nums[j] > num) {
                j--;
            }
            while (i < right && nums[i] <= num) {
                i++;
            }

            if (i >= j) {
                break;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int temp = nums[j];
        nums[j] = nums[left];
        nums[left] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        new Solution().sort(nums, 0, nums.length - 1);
    }

}
