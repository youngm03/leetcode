package 二叉树._701二叉搜索树中的插入操作;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 17:10
 */
public class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root, val);
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (root.val > val) {
            root.left = insert(root.left, val);
        }
        if (root.val < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

}
