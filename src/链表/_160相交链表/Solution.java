package 链表._160相交链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/25 20:05
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            if (nodeA == null) {
                nodeA = headB;
            } else {
                nodeA = nodeA.next;
            }
            if (nodeB == null) {
                nodeB = headA;
            } else {
                nodeB = nodeB.next;
            }
        }
        return nodeA;
    }
}
