package ex01;

public class KeyExistsException extends Exception {
    public KeyExistsException() {
        super("Key akready exists");
    }
}
