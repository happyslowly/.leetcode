package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class SearchingTest {
    private final Searching instance = new Searching();

    @Test
    public void testCheckIfExist() {
        Assert.assertTrue(instance.checkIfExist(new int[]{10, 2, 5, 3}));
    }

    @Test
    public void testValidMountainArray() {
        Assert.assertTrue(instance.validMountainArray(new int[]{0, 3, 2, 1}));
    }
}