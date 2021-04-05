package misc;

public class MyException {
    public static class BlaException extends Exception {
    }

    public static void main(String[] args) {
        try {
            process("bla");
        } catch (NullPointerException e) {
            System.out.println("Null not allowed");
        } catch (BlaException b) {
            System.out.println("BlaException called");
        }
    }

    private static void process(String bla) throws BlaException {
        if (bla == null) {
            throw new NullPointerException();
        }
        if (bla.equals("bla")) {
            throw new BlaException();
        }
        System.out.println(bla);
    }
}

