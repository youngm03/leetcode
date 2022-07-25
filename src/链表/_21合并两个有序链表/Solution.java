package 链表._21合并两个有序链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/25 21:14
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode p1 = list1, p2 = list2, p = dummy;
        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                dummy.next = p1;
                p1 = p1.next;
            } else {
                dummy.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

}
