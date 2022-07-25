package 链表._141环形链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/25 19:51
 */
public class Solution {
    /**
     * 有Base Case解法
     * @param head
     * @return
     */
//    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast.next != null && fast.next.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
