package lab5.exception;

public class ChException extends Exception {
    public ChException(String message) {
        super(String.format("New Exception %s", message));
    }
}
