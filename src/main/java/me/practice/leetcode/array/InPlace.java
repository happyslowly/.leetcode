package me.practice.leetcode.array;

public class InPlace {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];

        if (arr.length == 0) {
            return ans;
        }
        if (arr.length == 1) {
            ans[0] = -1;
            return ans;
        }
        ans[arr.length - 1] = -1;
        int max = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            max = Math.max(max, arr[i]);
            ans[i - 1] = max;
        }

        return ans;
    }
}
