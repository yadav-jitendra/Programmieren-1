package misc;

public class Unit {
    private static int calculate(int i, int j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        return i / j;
    }

    public static void process(int i, int j) {
        int result = calculate(i, j);
        System.out.println(result);
    }

    public static void main(String[] args) {
        process(10, 0);
    }
}
