package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.ListNode;

public class TwoPointer {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        ListNode p = head;
        while (p != fast) {
            p = p.next;
            fast = fast.next;
        }
        return p;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;

        while (p != q) {
            p = p != null ? p.next : headB;
            q = q != null ? q.next : headA;
        }

        return p;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast;
        for (fast = head; fast != null && n > 0; n--, fast = fast.next) ;
        if (fast == null) {
            // remove head
            return head == null ? null : head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
