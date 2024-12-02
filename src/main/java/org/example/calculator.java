package org.example;

import java.util.List;

public class calculator {

    public static boolean isSafe(List<Integer> array) {
        if (array == null || array.size() < 2) {
            return true;
        }

        boolean increasing = array.get(1) > array.get(0);
        boolean decreasing = array.get(1) < array.get(0);

        for (int i = 0; i < array.size() - 1 ; i++) {
            if (increasing && array.get(i) > array.get(i + 1)) {
                return false;
            }
            if (decreasing && array.get(i) < array.get(i + 1)) {
                return false;
            }
            if (array.get(i).equals(array.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
