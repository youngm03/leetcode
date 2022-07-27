package 链表._876链表的中间结点;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/26 20:51
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
