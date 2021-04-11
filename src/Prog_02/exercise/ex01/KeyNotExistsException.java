package ex01;

public class KeyNotExistsException extends Throwable {
    public KeyNotExistsException() {
        super("Key does not exists");
    }
}
