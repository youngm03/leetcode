package 链表._92反转链表II;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 20:30
 */
public class Solution {
    ListNode next;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) {
            return reverse(head, right);
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    private ListNode reverse(ListNode head, int num) {
        if (num == 1) {
            next = head.next;
            return head;
        }
        ListNode reverse = reverse(head.next, num - 1);
        head.next.next = head;
        head.next = next;
        return reverse;
    }

}
