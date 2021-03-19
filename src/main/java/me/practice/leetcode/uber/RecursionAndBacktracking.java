package me.practice.leetcode.uber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecursionAndBacktracking {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, 0, new LinkedList<>(), ans);
        return ans;
    }

    private void subsets(int[] nums, int start,
                         LinkedList<Integer> list,
                         List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            subsets(nums, i + 1, list, ans);
            list.removeLast();
        }
    }
}
