package pl.themolka.jbb.parser;

public class BBException extends Exception {
    public BBException() {
        super();
    }

    public BBException(String message) {
        super(message);
    }

    public BBException(String message, Throwable cause) {
        super(message, cause);
    }

    public BBException(Throwable cause) {
        super(cause);
    }
}
