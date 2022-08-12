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
        ListNode p1 = headA, p2 = headB;
        while (p1 != null && p2 != null) {
            if (p1.next == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2.next == null) {
                p2 = headA;
                p2 = p2.next;
            }
            if (p1 == p2) {
                return p1;
            }
        }
        return null;
    }
}
