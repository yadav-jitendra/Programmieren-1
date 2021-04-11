package misc;

import java.util.Random;

public class RandomNumbers {
    public static final int DIFF_NUMBERS = 100;
    public static final int TOTAL_NUMBERS = 1000000;

    public static void main(String[] args) {
        int[] numbers = new int[DIFF_NUMBERS + 1];

        Random r = new Random();
        for (int i = 0; i < TOTAL_NUMBERS; i++)
            numbers[r.nextInt(DIFF_NUMBERS) + 1]++;

        for (int i = 1; i <= DIFF_NUMBERS; i++)
            System.out.println(i + ": " + numbers[i]);
    }
}
