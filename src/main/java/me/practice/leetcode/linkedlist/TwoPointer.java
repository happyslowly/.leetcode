package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.ListNode;

public class TwoPointer {
    public boolean hasCycle(ListNode head) {
        for (ListNode slow = head, fast = head;
             slow != null && fast != null && fast.next() != null;
             slow = slow.next()) {

            fast = fast.next().next();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next() != null) {
            fast = fast.next().next();
            slow = slow.next();
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next() == null) {
            return null;
        }
        ListNode p = head;
        while (p != fast) {
            p = p.next();
            fast = fast.next();
        }
        return p;
    }
}
