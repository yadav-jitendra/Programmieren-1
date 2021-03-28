package blatt03;

public class Wahrscheinlichkeit {
    public static void main(String[] args) {
        for (int i = 2; i <= 60; i++) {
            System.out.printf("%3d:   %12.10f%n", i, p(i));
        }
    }
    static double p(int n) {
        double product = 1.0;
        for (int i = 0; i <= n - 1; i++) {
            product = product * ((365.0 - i)/365.0);
        }
        return 1 - product;
    }

}
