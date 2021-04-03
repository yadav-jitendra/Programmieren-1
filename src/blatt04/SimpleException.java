package blatt04;

public class SimpleException {
    public static void main(String[] args) throws NumberFormatException {
        int input = 0;

        try {
            input = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Parameter missing");
            input = 1;
            return;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }

        if (input > 10) {
            throw new NumberFormatException("Number is greater than 10");
        }

        System.out.println("input : " + input);

        int ans = twentyBy(input);
        if (ans == 0) {
            System.out.println("20/" + input + " = infinity");
        } else {
            System.out.println("20/" + input + " = " + ans);
        }
    }

    private static int twentyBy(int input) {
        int ans = 0;
        try {
            ans = 20 / input;
        } catch (Exception e) {
            System.out.println("Division by zero");
        }
        return ans;
    }
}
