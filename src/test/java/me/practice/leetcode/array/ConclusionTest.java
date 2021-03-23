package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ConclusionTest {
    private final Conclusion instance = new Conclusion();

    @Test
    public void heightChecker() {
        Assert.assertEquals(3,
                instance.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

    @Test
    public void findDisappearedNumbers() {
        Assert.assertEquals(Arrays.asList(5, 6),
                instance.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void thirdMax() {
        Assert.assertEquals(1, instance.thirdMax(new int[]{2, 2, 3, 1}));
    }

}