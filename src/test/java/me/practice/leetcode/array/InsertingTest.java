package me.practice.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class InsertingTest {
    private final Inserting instance = new Inserting();

    @Test
    public void testDuplicateZeros() {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        instance.duplicateZeros(arr);
        Assert.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    public void testMerge() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        instance.merge(nums1, 3, nums2, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

}