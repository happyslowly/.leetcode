package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class IntroductionTest {
    private final Introduction instance = new Introduction();

    @Test
    public void findMaxConsecutiveOnes() {
        Assert.assertEquals(3,
                instance.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    @Test
    public void findNumbers() {
        Assert.assertEquals(2,
                instance.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

    @Test
    public void sortedSquares() {
        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121},
                instance.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }
}