package it.sibguys.entities.user;

public class InvalidProfessionException extends Exception {
    public InvalidProfessionException(String message) {
        super(message);
    }

    public InvalidProfessionException(String message, Throwable cause) {
        super(message, cause);
    }
}
