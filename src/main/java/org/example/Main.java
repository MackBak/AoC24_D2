package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String csvFile = "src/main/resources/data_aocD2.csv";
        CsvReader csvReader = new CsvReader(csvFile);

        List<List<Integer>> arrays = csvReader.csvParseToArrays(csvFile);

//        // Testprint to check if Arrays split
//        for (int i = 0; i < arrays.size() ; i++) {
//            System.out.println("### Printing Array " + i + " ###");
//            System.out.println(arrays.get(i)); // 999 arrays
//        }

        // Print to confirm safe combinations
        int safeSum = 0;
        for (int i = 0; i < arrays.size() ; i++) {
            boolean safe = calculator.isSafe(arrays.get(i));
            if (safe) {
                safeSum = safeSum + 1;
                System.out.println("Safe sum is now: " + safeSum);
            }
        }

        System.out.println(calculator.isSafe(List.of(1, 2, 3, 4))); // true (increasing)
        System.out.println(calculator.isSafe(List.of(4, 3, 2, 1))); // true (decreasing)
        System.out.println(calculator.isSafe(List.of(1, 3, 2, 4))); // false (trend reversal)
        System.out.println(calculator.isSafe(List.of(1, 2, 2, 3))); // false (equal values)
        System.out.println(calculator.isSafe(List.of(5)));      // true (trivially safe)
        System.out.println(calculator.isSafe(List.of()));           // true (trivially safe)

    }
}