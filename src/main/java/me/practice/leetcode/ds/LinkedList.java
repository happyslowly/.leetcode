package me.practice.leetcode.ds;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public static LinkedList from(int[] nums) {
        LinkedList list = new LinkedList();
        for (int num : nums) {
            list.addAtTail(num);
        }
        return list;
    }

    public static LinkedList from(ListNode p) {
        LinkedList list = new LinkedList();
        list.head = p;
        ListNode q = p;
        while (q != null && q.next != null) {
            list.size++;
            q = q.next;
        }
        list.tail = q;
        list.size++;
        return list;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void extend(LinkedList other) {
        if (other.isEmpty()) {
            return;
        }

        if (head == null) {
            head = other.head;
        } else {
            tail.next = other.head;
        }
        tail = other.tail;
        size += other.size;
    }

    public int get(int index) {
        //System.out.println(this);
        ListNode p = head;
        while (p != null && index > 0) {
            p = p.next;
            index--;
        }
        return p == null ? -1 : p.val;
    }

    public void addAtHead(int val) {
        ListNode n = new ListNode(val);
        if (head != null) {
            n.next = head;
            head.prev = n;
        } else {
            tail = n;
        }
        head = n;
        size++;
    }

    public void addAtTail(int val) {
        ListNode n = new ListNode(val);
        if (tail != null) {
            tail.next = n;
            n.prev = tail;
        } else {
            head = n;
        }
        tail = n;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        ListNode p = getNodeByIndex(index - 1);
        if (p == null) {
            return;
        }

        ListNode n = new ListNode(val);
        if (p.next != null) {
            p.next.prev = n;
        } else {
            tail = n;
        }
        n.next = p.next;
        p.next = n;
        n.prev = p;
        size++;
    }

    public void deleteAtIndex(int index) {
        ListNode p = getNodeByIndex(index);

        if (p == null) {
            return;
        }

        if (p.prev == null && p.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }

        if (p.prev != null) {
            p.prev.next = p.next;
        } else {
            head = p.next;
        }
        if (p.next != null) {
            p.next.prev = p.prev;
        } else {
            tail = p.prev;
        }

        p.next = null;
        p.prev = null;
        size--;
    }

    private ListNode getNodeByIndex(int i) {
        ListNode p = head;
        while (p != null && i > 0) {
            p = p.next;
            i--;
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ListNode p = head; p != null; p = p.next) {
            if (p != head) {
                sb.append("->");
            }
            sb.append(p.val)
//                    .append("(")
//                    .append(p.prev == null ? "null" : p.prev.val )
//                    .append(",")
//                    .append(p.next == null ? "null" : p.next.val)
//                    .append(")")
            ;
        }
        return sb.toString();
    }
}
