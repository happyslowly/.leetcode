package me.practice.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Foo {
    public List<String> time(int[] pool) {
        List<String> ans = new ArrayList<>();
        time(pool, new StringBuilder(), ans);
        return ans;
    }

    private void time(int[] pool, StringBuilder sb, List<String> ans) {
        if (sb.length() == 4) {
            int hour = Integer.parseInt(sb.substring(0, 2));
            int minute = Integer.parseInt(sb.substring(2, 4));
            if (hour < 24 && minute < 60) {
                ans.add(hour + ":" + minute);
            }
        }

        for (int n : pool) {
            if (sb.indexOf(String.valueOf(n)) != -1) {
                continue;
            }
            sb.append(n);
            time(pool, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public double pi() {
        int trials = 1_000_000;
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < trials; i++) {
            double x = rand.nextDouble() - .5;
            double y = rand.nextDouble() - .5;
            if (Math.sqrt(x * x + y * y) <= 0.5) {
                count++;
            }
        }
        return 4.0 * count / trials;
    }


    public static void main(String[] args) {
        System.out.println(new Foo().time(new int[]{1, 2, 3, 4}));

        //System.out.println(new Foo().pi());
    }
}
