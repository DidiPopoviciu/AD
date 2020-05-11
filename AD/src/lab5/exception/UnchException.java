package lab5.exception;

public class UnchException extends RuntimeException{

    public UnchException(String message){
        super(String.format("EnchException %s", message));
    }
}
