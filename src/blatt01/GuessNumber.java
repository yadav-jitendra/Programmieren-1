package blatt01;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        if (args.length > 0){
            computerGuess(Integer.parseInt(args[0]));
        }else {
            selfGuess();
        }
    }

    private static void selfGuess() {
        int toGuess = (int) (Math.random()*100);

        System.out.println("Enter a number between 1 and 100");
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int myGuess = -1;
        while(myGuess != toGuess){
            myGuess = sc.nextInt();
            if (myGuess > toGuess) System.out.println("Die Zahl ist zu groß.");
            if (myGuess < toGuess) System.out.println("Die Zahl ist zu klein.");
            counter ++;
        }
        System.out.println("Du hast die Zahl nach " + counter + " Versuchen erraten.");
    }

    private static void computerGuess(int parseInt) {       // this need to be implemented with binary search to
        int counter = 1;                                    // guess in minimum attempt
        int guess = 0;

        while (guess != parseInt){
            guess = (int) (Math.random() *100);
            counter++;
        }
        System.out.println("Computer guessed in " + counter + " attempt");
    }
}
