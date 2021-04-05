package misc;

public class TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            int i = 1/1;
        }
        catch (ArithmeticException c){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i+": "+100/i);
            } catch (Exception e) {
                System.out.println(i+ ": error");
            }
        }

    }
}
