package 二叉树._111二叉树的最小深度;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/8 22:31
 */
public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right) + 1;
    }

}
