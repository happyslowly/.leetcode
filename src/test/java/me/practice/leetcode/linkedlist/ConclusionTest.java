package me.practice.leetcode.linkedlist;

import me.practice.leetcode.ds.LinkedList;
import me.practice.leetcode.ds.LinkedList.ListNode;
import org.junit.Test;

public class ConclusionTest {

    private final Conclusion instance = new Conclusion();

    @Test
    public void mergeTwoLists() {
        LinkedList list1 = LinkedList.from(new int[]{1, 2, 4});
        LinkedList list2 = LinkedList.from(new int[]{1, 3, 4});
        ListNode p = instance.mergeTwoLists(list1.head(), list2.head());
        System.out.println(LinkedList.from(p));
    }

    @Test
    public void addTwoNumbers() {
        LinkedList list1 = LinkedList.from(new int[]{2, 4, 3});
        LinkedList list2 = LinkedList.from(new int[]{5, 6, 4});
        ListNode p = instance.addTwoNumbers(list1.head(), list2.head());
        System.out.println(LinkedList.from(p));
    }

}