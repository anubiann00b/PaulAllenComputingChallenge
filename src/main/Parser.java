package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

/** A class built around a buffered reader which can sort and stuff. */
public class Parser {
        
    public static Data[] parse(String ref) throws FileNotFoundException, ParseException, IOException {
        BufferedReader reader;
        Data[] data = new Data[6671];

        reader = new BufferedReader(new FileReader(ref));
        
        reader.readLine(); // Header.
        String line = null;
        for (int i=0;i<6671;i++) {
            line = reader.readLine();

            Data newData = new Data(line,i);

            data[i] = newData;
        }
        return data;
    }
}