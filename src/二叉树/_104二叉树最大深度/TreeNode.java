package 二叉树._104二叉树最大深度;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/20 21:36
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

