package blatt02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class COVID {
    public static void main(String[] args) {
        File file = new File("RKI_COVID19.csv");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File NOT found :(");
            e.printStackTrace();
        }

        String[] nameOfCol = fileReader.nextLine().split(",");

        int numOfRows = 0;
        while (fileReader.hasNextLine()) {
            String nextline = fileReader.nextLine();
            numOfRows++;
        }

        String[][] dataEachLine = new String[numOfRows][nameOfCol.length];

        fileReader = null;          // this block is to skip first row i.e Header
        try {                       // Need better way of doing this
            fileReader = new Scanner(file);
            fileReader.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        numOfRows = 0;
        while (fileReader.hasNextLine()) {
            dataEachLine[numOfRows] = fileReader.nextLine().split(",");
            numOfRows++;
        }


        int totalCured = 0;

        for (String[] eachLine : dataEachLine) {
            totalCured += Integer.parseInt(eachLine[9]);

        }

        System.out.println("Total Cured = " + totalCured);


    }
}
