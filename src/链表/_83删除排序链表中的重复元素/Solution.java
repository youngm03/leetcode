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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode left = dummy, right = dummy;
        while (right != null) {
            if (left.val == right.val) {
                right = right.next;
            } else {
                left.next = right;
                left = right;
                right = right.next;
            }
        }
        return dummy.next;
    }

}
