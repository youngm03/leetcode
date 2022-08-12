package 链表._206反转链表;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/3 20:16
 */
public class Soluiton {

    /**
     * 迭代
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, curr = head, next = head;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

//    递归
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode listNode = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return listNode;
//    }

}
