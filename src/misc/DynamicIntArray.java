package misc;

import java.util.Scanner;

public class DynamicIntArray {
    public static void main(String[] args) {
        String[] array = getStrings();
        for (String eachStrings : array){
            System.out.println(eachStrings);
        }
    }


    private static String[] getStrings() {
        Scanner in = new Scanner(System.in);
        String[] array = new String[5];
        int itemRead = 0;

        System.out.println("enter strings, one per line");
        System.out.println("terminate with empty line ");

        while (in.hasNextLine()){
            String oneLine = in.nextLine();

            if (oneLine.equals("")){
                break;
            }
            if (itemRead == array.length){
                array = resize(array, array.length * 2);
            }

            array[itemRead] = oneLine;
            itemRead++;
        }

        return resize(array,itemRead);
    }

    private static String[] resize(String[] array, int newSize) {   // dynamically resize the array
        String[] original = array;               // copies reference of original array
        int minSize = Math.min(original.length, newSize);

        array = new String[newSize];            // creates new array of desired size
        for (int i = 0; i < minSize; i++) {
            array[i] = original[i];
        }
        return array;           // at the end "original" references to null, garbage collector!
     }
}
