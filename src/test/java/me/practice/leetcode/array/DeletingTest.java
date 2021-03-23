package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DeletingTest {
    private final Deleting instance = new Deleting();

    @Test
    public void removeElement() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int len = instance.removeElement(nums, 2);
        Assert.assertEquals(5, len);
    }

    @Test
    public void removeDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = instance.removeDuplicates(nums);
        Assert.assertEquals(5, len);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4},
                Arrays.copyOfRange(nums, 0, len));

    }


}