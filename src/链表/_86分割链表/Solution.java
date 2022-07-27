package 链表._86分割链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/26 20:41
 */
public class Solution {

    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p = head, p1 = dummy1, p2 = dummy2;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }
//            断开原链表结点的next指针
            ListNode next = p.next;
            p.next = null;
            p = next;
        }
        p1.next = dummy2.next;
        return dummy1.next;
    }

}
