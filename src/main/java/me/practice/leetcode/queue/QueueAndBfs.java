package me.practice.leetcode.queue;

import java.util.*;

public class QueueAndBfs {
    public int openLock(String[] deadends, String target) {
        String init = "0000";

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(init);
        visited.add(init);

        int min = -1;
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String s = queue.poll();
                if (dead.contains(s)) {
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    for (int step : new int[]{1, 9}) {
                        String combo = rotate(s, j, step);
                        if (!visited.contains(combo)) {
                            if (combo.equals(target)) {
                                min = depth;
                            }
                            visited.add(combo);
                            queue.offer(combo);
                        }
                    }
                }
            }
        }
        return min;
    }

    private static String rotate(String s, int i, int step) {
        StringBuilder sb = new StringBuilder(s);
        int n = Integer.parseInt(sb.substring(i, i + 1));
        sb.setCharAt(i, String.valueOf((n + step) % 10).charAt(0));
        return sb.toString();
    }

    public int numSquares(int n) {
        int[] squares = new int[100];
        for (int i = 0; i < 100; i++) {
            squares[i] = (i + 1) * (i + 1);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                int m = queue.poll();
                int j = Arrays.binarySearch(squares, m);
                if (j < 0) {
                    j = j * -1 - 2;
                }
                while (j >= 0) {
                    if (m == squares[j]) {
                        return depth;
                    }
                    queue.offer(m - squares[j]);
                    j--;
                }
            }
        }

        return -1;
    }
}
