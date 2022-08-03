package 二叉树._543二叉树直径;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 22:20
 */
public class Solution {

    int zhijing = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return zhijing;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        zhijing = Math.max(zhijing, left + right);
        return Math.max(left, right) + 1;
    }

}
