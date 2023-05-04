package com.philip.email_marketing_system.exception;

public class TagException extends Exception {
    private final int errorCode;

    public TagException(String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
