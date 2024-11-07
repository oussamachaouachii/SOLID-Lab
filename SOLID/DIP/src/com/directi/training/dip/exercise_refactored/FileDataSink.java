package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataSink implements DataSink {
    private String filePath;

    public FileDataSink(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        }
    }
}
