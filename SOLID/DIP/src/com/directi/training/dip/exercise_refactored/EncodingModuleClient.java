package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
      
        EncodingModule fileToFileEncoder = new EncodingModule(
            new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"),
            new FileDataSink("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt")
        );
        fileToFileEncoder.encode();

       
        EncodingModule networkToDatabaseEncoder = new EncodingModule(
            new NetworkDataSource(new URL("http", "myfirstappwith.appspot.com", "/index.html")),
            new DatabaseDataSink()
        );
        networkToDatabaseEncoder.encode();
    }
}
