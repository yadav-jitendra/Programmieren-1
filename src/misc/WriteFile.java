package misc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            for (int i = 0; i < 10; i++) {
                writer.write("line : " + i + "\n");     // methode : .write
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // ALTERNATIVE
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("test2.txt"))) {
            for (int i = 0; i < 10; i++) {
                printWriter.printf("Test : %d \n", i);      // methode : .printf or .println
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
