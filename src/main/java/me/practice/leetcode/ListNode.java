package me.practice.leetcode;

import lombok.Data;

@Data
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

}
