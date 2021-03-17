package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ConclusionTest {
    private final Conclusion instance = new Conclusion();

    @Test
    public void testHeightChecker() {
        Assert.assertEquals(3,
                instance.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

}