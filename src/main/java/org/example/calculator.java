package org.example;

import java.util.List;

public class calculator {

    public static boolean isSafe(List<Integer> array) {
        if (array == null || array.size() < 2) {
            return true;
        }

        boolean increasing = array.get(1) > array.get(0);
        boolean decreasing = array.get(1) < array.get(0);
        if (!increasing && !decreasing) {
            return false;
        }

        for (int i = 0; i < array.size() - 1; i++) {
            int current = array.get(i);
            int next = array.get(i + 1);
            int difference = Math.abs(next - current);

            if (difference < 1 || difference > 3) {
                return false;
            }
            if (decreasing && next >= current) {
                return false;
            }
            if (increasing && next <= current) {
                return false;
            }
        }
        return true;
    }
}
