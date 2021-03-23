package me.practice.leetcode.queue;

import org.junit.Assert;
import org.junit.Test;

public class QueueAndBfsTest {
    private final QueueAndBfs instance = new QueueAndBfs();

    @Test
    public void openLock() {
        Assert.assertEquals(6, instance.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));

    }

    @Test
    public void numSquares() {
        Assert.assertEquals(2, instance.numSquares(13));
    }
}