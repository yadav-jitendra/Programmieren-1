package blatt01;

public class Calculator {
    public static void main(String[] args) {
        int zahl00 = Integer.parseInt(args[0]);
        int operator = Integer.parseInt(args[1]);
        int zahl02 = Integer.parseInt(args[2]);



        switch (operator) {
            case 1 -> System.out.println(zahl00 + zahl02);
            case 2 -> System.out.println(zahl00 - zahl02);
            case 3 -> System.out.println(zahl00 * zahl02);
            case 4 -> System.out.println(zahl00 / zahl02);
            default -> System.out.println("Invalid oparator");
        }
    }
}
