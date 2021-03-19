package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class InPlaceTest {

    private final InPlace instance = new InPlace();

    @Test
    public void testReplaceElements() {
        Assert.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1},
                instance.replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
    }

}