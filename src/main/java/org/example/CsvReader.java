package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private final String fileName;

    public CsvReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Integer> csvParseToArrays(String csvFile) throws IOException {
        List<Integer> arrays = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] values = line.split(","); // TODO: Doublecheck cause some parts in CSV end with ,,,,
            List<Integer> temp = new ArrayList<>();

            for (String value : values) {
                if (!value.isBlank()) { // TODO: Maybe isEmpty?
                    temp.add(Integer.parseInt(value));
                }
            }
            arrays.addAll(temp);
        }
        return arrays;
    }
}
