package 二叉树._700二叉搜索树中的搜索;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 17:04
 */
public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return root;
    }



}
