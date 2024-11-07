package com.directi.training.dip.exercise_refactored;

public interface DataSink {
    void write(String data) throws IOException;
}
