package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataSource implements DataSource {
    private URL url;

    public NetworkDataSource(URL url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        }
        return content.toString();
    }
}
