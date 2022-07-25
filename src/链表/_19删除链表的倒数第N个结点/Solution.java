package 链表._19删除链表的倒数第N个结点;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/25 20:41
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = findFromEnd(dummy, n + 1);
        pre.next = pre.next.next;
        return head;
    }

    private ListNode findFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

}
