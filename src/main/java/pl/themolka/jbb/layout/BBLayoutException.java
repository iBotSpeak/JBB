package pl.themolka.jbb.layout;

public class BBLayoutException extends Exception {
    public BBLayoutException() {
    }

    public BBLayoutException(String message) {
        super(message);
    }

    public BBLayoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public BBLayoutException(Throwable cause) {
        super(cause);
    }
}
