package blatt05;

public class SimpleException {
    public static void main(String[] args) throws NumberFormatException {
        int input = 0;

        try {
            input = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Parameter missing");
            input = 1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }

        if (input > 10) {
            throw new NumberFormatException("Number is greater than 10");
        }

        System.out.println("input : " + input);

        int ans = twentyBy(input);
        System.out.println("20/" + input + " = " + ans);

    }

    public static int twentyBy(int input) {
        return 20/ input ;
    }
}
