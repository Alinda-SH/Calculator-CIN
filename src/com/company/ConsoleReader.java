package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    /**
     *  Reads the input line from the console
     *
     * @return Line
     */
    public String readLine() {
        try{
            String line = (new BufferedReader(
                    new InputStreamReader(System.in))
            ).readLine();

            return line;
        }
        catch(IOException ex) {
            return "Gibberish input detected";
        }
    }
}