package Prog_02.misc;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        byte[] data = new byte[5];
        try (FileInputStream inputFile = new FileInputStream("outputStream.txt")) {
            int readByte = inputFile.read(data);
            while (readByte != -1){
                System.out.println(readByte);
                readByte = inputFile.read(data);
            }
        }catch (IOException e){
            System.out.println("error");
        }

    }
}
