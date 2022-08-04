package 二叉树._105从前序与中序遍历序列构造二叉树;

import java.util.HashMap;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/4 21:30
 */
public class Solution {

        HashMap<Integer, Integer> map = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return build(preorder, 0, preorder.length - 1,
                    inorder, 0, inorder.length - 1);
        }

        private TreeNode build(int[] preorder, int preStart, int preEnd,
                               int[] inorder, int inStart, int inEnd) {
            if (preStart > preEnd) {
                return null;
            }
            TreeNode root = new TreeNode(preorder[preStart]);
            int index = map.get(preorder[preStart]);
            int size = index - inStart;
            root.left = build(preorder, preStart + 1, preStart + size, inorder, 0, index - 1);
            root.right = build(preorder, preStart + size + 1, preEnd, inorder, index + 1, inEnd);
            return root;
        }

}
