/*
两个链表的第一个公共结点

题目描述
输入两个链表，找出它们的第一个公共结点。

 */
public class Test36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p = pHead1;
        int count1 = 0;
        while (p != null) {
            count1++;
            p = p.next;
        }

        ListNode q = pHead2;
        int count2 = 0;
        while (q != null) {
            count2++;
            q = q.next;
        }

        p = pHead1;
        q = pHead2;
        if (count1 - count2 >= 0) {
            int a = count1 - count2;
            for (int i = 0; i<a; i++) {
                p = p.next;
            }
        } else {
            int b = count2 - count1;
            for (int i = 0; i<b; i++) {
                q = q.next;
            }
        }
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
