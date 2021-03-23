package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.LinkedList.ListNode;

import java.util.Stack;

public class Classic {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode h = head;
        ListNode p = head.next;

        while (p != null) {
            head.next = p.next;
            p.next = h;
            h = p;

            p = head.next;
        }
        return h;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy, curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        for (ListNode p = head; p != null; p = p.next) {
            stack.push(p);
        }

        for (ListNode p = head; p != null; p = p.next) {
            if (stack.pop().val != p.val) {
                return false;
            }
        }
        return true;
    }

}
