package 二叉树._654最大二叉树;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/4 20:46
 */
public class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int index = findMaxVal(nums, left, right);
        TreeNode root = new TreeNode(nums[index]);
        root.left = build(nums, left, index - 1);
        root.right = build(nums, index + 1, right);
        return root;
    }

    private int findMaxVal(int[] nums, int left, int right) {
        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = left; i <= right; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                index = i;
            }
        }
        return index;
    }

}
