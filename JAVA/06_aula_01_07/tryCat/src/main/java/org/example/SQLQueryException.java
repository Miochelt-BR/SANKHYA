package org.example;

public class SQLQueryException extends Exception {
    public SQLQueryException(String message) {
        super(message);
    }

    public SQLQueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
