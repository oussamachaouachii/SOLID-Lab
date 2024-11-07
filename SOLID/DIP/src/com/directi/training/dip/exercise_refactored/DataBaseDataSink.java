package com.directi.training.dip.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class DatabaseDataSink implements DataSink {
    private Map<Integer, String> dataStore = new HashMap<>();
    private int idCounter = 0;

    @Override
    public void write(String data) {
        dataStore.put(++idCounter, data);
    }
}