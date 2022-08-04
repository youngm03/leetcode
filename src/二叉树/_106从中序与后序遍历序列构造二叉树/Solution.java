package 二叉树._106从中序与后序遍历序列构造二叉树;

import java.util.HashMap;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/4 21:46
 */
public class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int inStart, int inEnd,
                           int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = map.get(postorder[postEnd]);
        int size = index - inStart;
        root.left = build(inorder, inStart, index - 1, postorder, postStart, postStart + size - 1);
        root.right = build(inorder, index + 1, inEnd, postorder, postStart + size, postEnd - 1);
        return root;
    }
}
