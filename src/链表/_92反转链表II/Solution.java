package 链表._92反转链表II;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 20:30
 */
public class Solution {
    ListNode next = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) {
            return reverseN(head, right);
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    public ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            next = head.next;
            return head;
        }
        ListNode listNode = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = next;
        return listNode;
    }

}
