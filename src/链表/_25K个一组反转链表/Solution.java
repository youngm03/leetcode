package 链表._25K个一组反转链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 20:40
 */
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = head, b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) {
                return b;
            }
            b = b.next;
        }
        ListNode reverse = reverse(head, b);
        a.next = reverseKGroup(b, k);
        return reverse;
    }

    public ListNode reverse(ListNode head, ListNode right) {
        ListNode pre = null, curr = head, next = head;
        while (curr != right) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
