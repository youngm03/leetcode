package 二叉树._104二叉树最大深度;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/20 21:36
 */
public class Solution {

    int maxDepth = 0;
    int level = 0;
    public int maxDepth(TreeNode treeNode) {
        traverse(treeNode);
        return maxDepth;
    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        level++;
        if (root.left == null && root.right == null) {
            maxDepth = Math.max(maxDepth, level);
        }
        traverse(root.left);
        traverse(root.right);
        level--;
    }
}
