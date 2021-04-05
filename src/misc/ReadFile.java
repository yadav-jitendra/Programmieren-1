package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("/home/jitendra/IdeaProjects/Programming1/src/misc/ReadFile.java");
        // File file = new File("hindi.txt");
        try (Scanner sc = new Scanner(file)) {
            int lineNumber = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(++lineNumber + "\t" + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exists");
        }
    }
}

// System.out.println(file.getAbsolutePath());    // returns full path of this file