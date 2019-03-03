package pentalog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class FileWriter {
    private ConsoleReader consoleReader;

    public FileWriter(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }

    public void write(final String path) {
        File file = new File(path);


        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(file))) {
            String nextLine = consoleReader.getNextLine();

            while (nextLine != null) {
                writer.write(nextLine);
                writer.newLine();
                nextLine = consoleReader.getNextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

