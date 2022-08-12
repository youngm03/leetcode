package 链表._234回文链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/12 23:30
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        ListNode traverse = traverse(slow);
        ListNode p1 = traverse, p2 = head;
        while (p1 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    private ListNode traverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = traverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
