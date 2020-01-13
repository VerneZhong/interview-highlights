package org.zxb.leetcode.algorithm;

/**
 * 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 708
 *
 * @author Mr.zxb
 * @date 2020-01-12 15:55
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);

        ListNode node = addTwoNumbers(l1, l2);

        System.out.println(node);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode q = l1, p = l2, curr = node;
        int z = 0;
        while (q != null || p != null) {
            int x = q != null ? q.val : 0;
            int y = p != null ? p.val : 0;
            int sum = x + y + z;
            z = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (q != null) {
                q = q.next;
            }
            if (p != null) {
                p = p.next;
            }
        }

        if (z > 0) {
            curr.next = new ListNode(z);
        }

        return node.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
