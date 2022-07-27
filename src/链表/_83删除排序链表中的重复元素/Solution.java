package 链表._83删除排序链表中的重复元素;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/27 21:11
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head, slow = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }

}
