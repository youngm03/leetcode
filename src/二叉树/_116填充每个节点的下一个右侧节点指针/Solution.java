package 二叉树._116填充每个节点的下一个右侧节点指针;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 23:05
 */
public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        reverse(root.left, root.right);
        return root;
    }

    public void reverse(Node left, Node right) {
        if (left == null) {
            return;
        }
        left.next = right;
        reverse(left.left, left.right);
        reverse(left.right, right.right);
        reverse(right.left, right.right);
    }

}
