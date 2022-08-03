package 二叉树._116填充每个节点的下一个右侧节点指针;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 23:05
 */

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
