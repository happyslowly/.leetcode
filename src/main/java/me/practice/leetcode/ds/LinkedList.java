package me.practice.leetcode.ds;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class LinkedList {
    private ListNode head;
    private ListNode tail;

    public static LinkedList from(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        for (int n : nums) {
            curr.next = new ListNode(n);
            curr = curr.next;
        }

        LinkedList list = new LinkedList();
        list.head = dummy.next;
        list.tail = list.head == null ? null : curr;
        return list;
    }

}
