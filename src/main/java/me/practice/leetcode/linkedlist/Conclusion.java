package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.ListNode;

public class Conclusion {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        int carry = 0;
        while (p != null || q != null) {
            int sum = carry + (p == null ? 0 : p.val) + (q == null ? 0 : q.val);
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            p = p == null ? null : p.next;
            q = q == null ? null : q.next;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
