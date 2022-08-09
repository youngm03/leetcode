package 二叉树._538把二叉搜索树转换为累加树;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 16:52
 */
public class Solution {

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }

}
