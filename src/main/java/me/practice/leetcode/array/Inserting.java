package me.practice.leetcode.array;

public class Inserting {
    public void duplicateZeros(int[] arr) {
        int shift = 0;
        for (int j : arr) {
            if (j == 0) {
                shift++;
            }
        }

        for (int i = arr.length - 1, j = i; i >= 0 && j >= 0; i--) {
            if (shift > 0) {
                if (arr[i] != 0) {
                    shift--;
                } else {
                    shift -= 2;
                    if (shift < 0) {
                        arr[j--] = 0;
                    }
                }
                continue;
            }
            arr[j--] = arr[i];
            if (arr[i] == 0) {
                arr[j--] = arr[i];
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -= 1;
        n -= 1;
        int i = nums1.length - 1;
        for (; i >= 0 && m >= 0 && n >= 0; i--) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }
    }
}
