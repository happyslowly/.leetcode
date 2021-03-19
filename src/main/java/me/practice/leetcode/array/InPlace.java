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

    public int[] sortArrayByParity(int[] A) {
        for (int slow = 0, fast = 0; fast < A.length; fast++) {
            if ((A[slow] & 1) == 1 && (A[fast] & 1) == 0) {
                int t = A[slow];
                A[slow] = A[fast];
                A[fast] = t;
                slow++;
            } else if ((A[slow] & 1) == 0) {
                slow++;
            }
        }
        return A;
    }

    // [0,1,0,3,12]
    // 1 0 0 3 12
    // [1,3,12,0,0]
    public void moveZeroes(int[] nums) {
        for (int slow = 0, fast = 0; fast < nums.length; fast++) {
            if (nums[slow] == 0 && nums[fast] != 0) {
                int t = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = t;
                slow++;
            } else if (nums[slow] != 0) {
                slow++;
            }
        }
    }
}
