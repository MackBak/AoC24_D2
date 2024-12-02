package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String csvFile = "src/main/resources/data_aocD2.csv";
        CsvReader csvReader = new CsvReader(csvFile);

        List<Integer> arrays = csvReader.csvParseToArrays(csvFile);
        System.out.println(arrays);
    }
}