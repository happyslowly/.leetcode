package me.practice.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class Searching {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            if (set.contains(n * 2) || set.contains(n / 2) && n % 2 == 0) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public boolean validMountainArray(int[] arr) {
        int i = 0;

        for (; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                break;
            }
        }

        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        for (; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                break;
            }
        }

        return i == arr.length - 1;
    }
}
