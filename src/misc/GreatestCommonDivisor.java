package misc;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int gcd = ggt(128, 34);
        int gcd2 = ggt2(128, 34);
        System.out.println(gcd);
        System.out.println(gcd2);
    }

    private static int ggt(int dividend, int divisor) {

        while (divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }

    private static int ggt2(int dividend, int divisor) {        // with recursion
        if (divisor == 0){
            return dividend;
        }
        return ggt2(divisor, dividend % divisor);
    }
}
