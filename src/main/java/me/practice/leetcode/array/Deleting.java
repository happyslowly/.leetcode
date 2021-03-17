package me.practice.leetcode.array;

public class Deleting {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; slow < nums.length && fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }
}
