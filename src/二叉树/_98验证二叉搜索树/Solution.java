package 二叉树._98验证二叉搜索树;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 16:57
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null) {
            return true;
        }
        if (minNode != null && minNode.val >= root.val) {
            return false;
        }
        if (maxNode != null && maxNode.val <= root.val) {
            return false;
        }
        return isValid(root.left, minNode, root) && isValid(root.right, root, maxNode);
    }

}
