package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.LinkedList;
import me.practice.leetcode.ds.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TwoPointerTest {
    private final TwoPointer instance = new TwoPointer();

    @Test
    public void testHasCycle() {
        LinkedList list = LinkedList.from(new int[]{3, 2, 0, -4});
        ListNode p = list.head().next();
        ListNode q = list.tail();
        q.next(p);

        Assert.assertTrue(instance.hasCycle(list.head()));
    }

    @Test
    public void testDetectCycle() {
        LinkedList list = LinkedList.from(new int[]{3, 2, 0, -4});
        ListNode p = list.head().next();
        ListNode q = list.tail();
        q.next(p);

        Assert.assertEquals(p, instance.detectCycle(list.head()));
    }


}