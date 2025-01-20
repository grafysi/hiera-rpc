package com.grafysi.hierarpc.exception;

public class UninitializedException extends RuntimeException {

    public UninitializedException(String message) {
        super(message);
    }

    public UninitializedException() {
        super();
    }
}
