package me.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionToIteration {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis(n, n, new StringBuilder(), ans);
        return ans;
    }

    private void generateParenthesis(int left, int right,
                                     StringBuilder sb,
                                     List<String> ans) {
        if (left == 0 && right == 0) {
            ans.add(sb.toString());
            return;
        }

        if (left < 0 || right < 0) {
            return;
        }

        if (left > right) {
            return;
        }

        sb.append('(');
        generateParenthesis(left - 1, right, sb, ans);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        generateParenthesis(left, right - 1, sb, ans);
        sb.deleteCharAt(sb.length() - 1);
    }
}
