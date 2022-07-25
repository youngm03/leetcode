package 链表._23合并K个升序链表;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/25 23:02
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> {
            return a.val - b.val;
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                queue.add(lists[i]);
            }
        }
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();
            head.next = poll;
            if (poll.next != null) {
                queue.add(poll.next);
            }
            head = head.next;
        }
        return dummy.next;
    }

}
