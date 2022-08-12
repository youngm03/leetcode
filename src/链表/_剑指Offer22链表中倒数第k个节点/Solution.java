package 链表._剑指Offer22链表中倒数第k个节点;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/12 19:36
 */
public class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
