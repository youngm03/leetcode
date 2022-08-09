package 排序.归并;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 2:09
 */
public class Solution {

    int[] temp;
    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge(nums, mid, left, right);
    }

    private void merge(int[] nums, int mid, int left, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int i = left;
        int j = mid + 1;
        for (int index = left; index <= right; index++) {
            if (i == mid + 1) {
                nums[index] = nums[j];
                j++;
            } else if (j == right + 1) {
                nums[index] = nums[i];
                i++;
            }else if (nums[i] <= nums[j]) {
                nums[index] = temp[i];
                i++;
            } else if (nums[j] <= nums[i]) {
                nums[index] = temp[j];
                j++;
            }
        }
    }
}
