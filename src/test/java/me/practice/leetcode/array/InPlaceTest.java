package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class InPlaceTest {

    private final InPlace instance = new InPlace();

    @Test
    public void replaceElements() {
        Assert.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1},
                instance.replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
    }

    @Test
    public void sortArrayByParity() {
        Assert.assertArrayEquals(new int[]{2, 4, 6, 1, 3},
                instance.sortArrayByParity(new int[]{3, 1, 2, 4, 6}));
    }

    @Test
    public void moveZeros() {
        int[] a = new int[]{0, 1, 0, 3, 12};
        instance.moveZeroes(a);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, a);
    }

}