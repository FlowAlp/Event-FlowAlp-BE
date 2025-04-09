package com.flowalp.event.exception;

public class DuplicateIdException extends RuntimeException {

    public DuplicateIdException(String message) {
        super(message);
    }

    public DuplicateIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
