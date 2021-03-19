package me.practice.leetcode.uber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, 0, new LinkedList<>(), ans);
        return ans;
    }

    public void permute(int[] nums, int start, LinkedList<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            permute(nums, 0, list, ans);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.permute(new int[]{1, 2, 3}));
    }
}
