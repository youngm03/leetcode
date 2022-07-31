package 动态规划.打家劫舍._337打家劫舍III;

import java.util.HashMap;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/31 23:37
 */
public class Solution {

    HashMap<TreeNode, Integer> memo = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (memo.containsKey(root)) {
            return memo.get(root);
        }
        int doIt = root.val
                + (root.left == null ? 0 : (rob(root.left.left) + rob(root.left.right)))
                + (root.right == null ? 0 : (rob(root.right.left) + rob(root.right.right)));
        int noDo = rob(root.left) + rob(root.right);
        int result = Math.max(doIt, noDo);
        memo.put(root, result);
        return result;
    }

}
