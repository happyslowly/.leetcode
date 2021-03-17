package me.practice.leetcode.array;

import java.util.Arrays;

public class Conclusion {
    // TODO: optimize
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        System.arraycopy(heights, 0, arr, 0, heights.length);
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
