package me.practice.leetcode.ds;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class ListNode {
    int val;
    @ToString.Exclude ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }
}
