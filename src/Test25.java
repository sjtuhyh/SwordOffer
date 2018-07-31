/*
复杂链表的复制
题目描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

/*在不用辅助空间的情况下实现O(n)的解法，大体步骤还是第二种思路那样两步，不同的是
第一步顺着next走的时候我们复制出来的新节点紧接着插入对应的旧节点后面，
第二步再复制random指针。最后一步就是将链表拆分成新链表和旧链表两个部分。
 */
public class Test25 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null)
            return pHead;

        //复制并且插入
        RandomListNode p = pHead;
        while (p != null) {
            RandomListNode tmp = new RandomListNode(p.label);
            tmp.next = p.next;
            p.next = tmp;
            p = tmp.next;
        }
        //复制random指针
        p = pHead;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        //拆分链表
        RandomListNode head = pHead.next;
        p = pHead;
        RandomListNode q = head;
        while (q.next != null) {
            p.next = q.next;
            p = p.next;

            q.next = p.next;
            q = p.next;
        }
        p.next = null;  //最后将原来链表的尾部设置为null
        return head;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

