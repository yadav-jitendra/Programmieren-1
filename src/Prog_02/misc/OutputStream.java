package Prog_02.misc;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        byte[] data = {1,2,3,4,5};

        try (FileOutputStream outputFile = new FileOutputStream("outputStream.txt")) {
            outputFile.write(data);
        }catch (IOException e){
            System.out.println("error");
        }
    }
}
