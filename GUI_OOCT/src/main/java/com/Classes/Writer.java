package com.Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void WriteFile(File SaveFile) {

        if (SaveFile.exists() && SaveFile.isFile() && SaveFile.canWrite()) {
            try {
                FileWriter file_writer = new FileWriter(SaveFile);
                BufferedWriter buffered_writer = new BufferedWriter(file_writer);

                buffered_writer.flush(); //makes sure your text reaches file
            } catch (IOException e) {
                System.err.println("Error writing to file");
            }
        } else {
            System.err.println("Cannot access file to write it!");
            System.exit(1);
        }

    }
}
