package pentalog;

import java.util.Scanner;

public class TextConsoleReader implements ConsoleReader {
    private Scanner scanner;

    public TextConsoleReader() {
        this.scanner = new Scanner(System.in);
        System.out.println("Please enter your text: ");

    }

    @Override
    public String getNextLine() {
        String text = scanner.nextLine();
        if ("-1".equals(text)) {
            System.out.println("End!");
            return null;
        } else {
            return text;
        }
    }
}
