package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private DataSource dataSource;
    private DataSink dataSink;

    public EncodingModule(DataSource dataSource, DataSink dataSink) {
        this.dataSource = dataSource;
        this.dataSink = dataSink;
    }

    public void encode() throws IOException {
        String input = dataSource.read();
        String encodedData = Base64.getEncoder().encodeToString(input.getBytes());
        dataSink.write(encodedData);
    }
}
