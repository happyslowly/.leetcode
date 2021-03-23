package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.LinkedList.ListNode;

public class Conclusion {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                prev.next = p1;
                p1 = p1.next;
            } else {
                prev.next = p2;
                p2 = p2.next;
            }
            prev = prev.next;
        }

        prev.next = p1 != null ? p1 : p2;

        return dummy.next;
    }

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
