package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.LinkedList;
import me.practice.leetcode.ds.LinkedList.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TwoPointerTest {
    private final TwoPointer instance = new TwoPointer();

    @Test
    public void testHasCycle() {
        LinkedList list = LinkedList.from(new int[]{3, 2, 0, -4});
        ListNode p = list.head().next;
        ListNode q = list.tail();
        q.next = p;

        Assert.assertTrue(instance.hasCycle(list.head()));
    }

    @Test
    public void testDetectCycle() {
        LinkedList list = LinkedList.from(new int[]{3, 2, 0, -4});
        ListNode p = list.head().next;
        ListNode q = list.tail();
        q.next = p;

        Assert.assertEquals(p, instance.detectCycle(list.head()));
    }

    @Test
    public void testGetIntersectionNode() {
        LinkedList list1 = LinkedList.from(new int[]{4, 1});
        LinkedList list2 = LinkedList.from(new int[]{5, 6, 1});
        LinkedList list3 = LinkedList.from(new int[]{8, 4, 5});
        list1.extend(list3);
        list2.extend(list3);

        Assert.assertEquals(list3.head(),
                instance.getIntersectionNode(list1.head(), list2.head()));

    }

    @Test
    public void testRemoveNthFromEnd() {
        LinkedList list = LinkedList.from(new int[]{1, 2, 3, 4, 5});

        ListNode p = instance.removeNthFromEnd(list.head(), 2);
        System.out.println(LinkedList.from(p));
    }
}