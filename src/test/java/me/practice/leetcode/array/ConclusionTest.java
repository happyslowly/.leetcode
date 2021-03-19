package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ConclusionTest {
    private final Conclusion instance = new Conclusion();

    @Test
    public void testHeightChecker() {
        Assert.assertEquals(3,
                instance.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

    @Test
    public void testFindDisappearedNumbers() {
        Assert.assertEquals(Arrays.asList(5, 6),
                instance.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

}