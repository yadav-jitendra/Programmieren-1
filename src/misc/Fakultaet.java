package misc;

public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(fak(6));
       // assert f(6) == fak(6);
    }

    public static int fak(int x) {
        if (x <= 0) {
            return 1;
        } else {
            return x * fak(x - 1);
        }
    }

    public static int f(int n) {
        return n <= 0 ? 1 : n * f(n - 1);
    }
}
