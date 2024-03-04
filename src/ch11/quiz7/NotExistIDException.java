package ch11.quiz7;

public class NotExistIDException extends Exception {
    public NotExistIDException() {}

    public NotExistIDException(String message) {
        super(message);
    }
}
