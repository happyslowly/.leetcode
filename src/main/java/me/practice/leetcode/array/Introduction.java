package me.practice.leetcode.array;

public class Introduction {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int n : nums) {
            if (n != 0) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (digits(n) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, j = nums.length - 1, t = nums.length - 1; i < nums.length && j >= 0 && t >= 0; t--) {
            int square;
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                square = nums[i++];
            } else {
                square = nums[j--];
            }
            arr[t] = square * square;
        }
        return arr;
    }

    private int digits(int n) {
        if (n == 0) {
            return 1;
        }

        int d = 0;
        while (n != 0) {
            d++;
            n /= 10;
        }
        return d;
    }
}
