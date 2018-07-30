/*
链表中倒数第k个节点
题目描述
输入一个链表，输出该链表中倒数第k个结点。
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class Test14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0)
            return null;
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i<k-1; i++) {
            q = q.next;
            if (q == null) {
                return null;
            }
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        return p;
    }
}

