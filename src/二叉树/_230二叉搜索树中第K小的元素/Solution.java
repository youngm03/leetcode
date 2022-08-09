package 二叉树._230二叉搜索树中第K小的元素;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 16:45
 */
public class Solution {

    int num = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        find(root, k);
        return result;
    }

    private void find(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        kthSmallest(root.left, k);
        num++;
        if (num == k) {
            result = root.val;
            return;
        }
        kthSmallest(root.right, k);
    }

}
