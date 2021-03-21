package me.practice.leetcode.ds;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
public class ListNode {
    public int val;

    @ToString.Exclude
    public ListNode prev;

    @ToString.Exclude
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
}
