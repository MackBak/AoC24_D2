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
//            System.out.println(arrays.get(i));
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

    }
}