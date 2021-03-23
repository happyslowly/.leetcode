package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.LinkedList;
import me.practice.leetcode.ds.LinkedList.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ClassicTest {

    private final Classic instance = new Classic();

    @Test
    public void testReverseList() {
        LinkedList list = LinkedList.from(new int[]{1, 2, 3, 4, 5});
        ListNode p = instance.reverseList(list.head());
        LinkedList list2 = LinkedList.from(p);
        System.out.println(list2);
    }

    @Test
    public void testRemoveElements() {
        LinkedList list = LinkedList.from(new int[]{3, 2, 3, 4, 5});
        ListNode p = instance.removeElements(list.head(), 3);

        LinkedList list2 = LinkedList.from(p);
        System.out.println(list2);
    }

    @Test
    public void testOddEvenList() {
        LinkedList list = LinkedList.from(new int[]{1, 2, 3, 4, 5});
        ListNode p = instance.oddEvenList(list.head());
        LinkedList list2 = LinkedList.from(p);
        System.out.println(list2);
    }

    @Test
    public void testIsPalindrome() {
        LinkedList list = LinkedList.from(new int[]{1, 2, 3, 3, 2, 1});
        Assert.assertTrue(instance.isPalindrome(list.head()));
    }
}