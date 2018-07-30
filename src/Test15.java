/*
反转链表
题目描述
输入一个链表，反转链表后，输出新链表的表头

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 */
public class Test15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null||head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;
        }
        return pre;
    }
}
