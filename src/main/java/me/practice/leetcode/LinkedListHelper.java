package me.practice.leetcode;

import java.util.List;

public class LinkedListHelper {

    public static ListNode from(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        for (int n : nums) {
            curr.next = new ListNode(n);
            curr = curr.next;
        }

        return dummy.next;
    }

}
