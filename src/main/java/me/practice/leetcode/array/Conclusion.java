package me.practice.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

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

//    public int findMaxConsecutiveOnes(int[] nums) {
//        int[] arr = new int[nums.length + 1];
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                // swap
                int toSwap = nums[i];
                while (true) {
                    int index = toSwap - 1;
                    if (index + 1 == nums[index]) {
                        break;
                    }
                    int t = nums[index];
                    nums[index] = toSwap;
                    toSwap = t;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : nums) {
            if (!queue.contains(n)) {
                queue.offer(n);
            }
            if (queue.size() > 3) {
                queue.poll();
            }
        }

        if (queue.size() == 3) {
            return queue.poll();
        }

        int max = -1;
        while (!queue.isEmpty()) {
            max = queue.poll();
        }
        return max;
    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0, j = nums.length - 1, m = nums.length - 1; i <= j; m--) {
            int x = Math.abs(nums[i]) < Math.abs(nums[j]) ? nums[j--] : nums[i++];
            ans[m] = x * x;
        }
        return ans;
    }
}
