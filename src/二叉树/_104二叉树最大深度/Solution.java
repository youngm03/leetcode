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

    /**
     * 对于二叉树的遍历形式只有递归
     * 对于二叉树题目的思考过程：
     * 1.是否可以通过遍历一遍二叉树得到答案？如果可以，用一个traverse函数（遍历函数）配合外部变量来解决。
     * 2.是否能够通过分解子问题，通过子问题的解得到原问题的解？如果可以则定义一个递归函数，充分利用这个函数的返回值来解决。
     * 以上也分别对应了回溯算法和动态规划的解题思路，
     * 回溯算法就是通过遍历决策树得到问题的解，动态规划通过分解子问题+备忘录得到问题的解
     *
     * 注意：无论使用哪种解题方式，都需要考虑二叉树的每一个节点需要做什么，需要在什么时候做（前中后）
     * @param root
     */
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        level++;
        maxDepth = Math.max(maxDepth, level);
        traverse(root.left);
        traverse(root.right);
        level--;
    }
}
