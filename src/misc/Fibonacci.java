package misc;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    private static long fib(long i) {
        if ((i == 0) || (i == 1)){
            return i;
        }else {
            return fib(i-1) + fib(i-2);
        }
    }
}
