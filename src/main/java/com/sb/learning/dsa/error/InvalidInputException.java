package com.sb.learning.dsa.error;

public class InvalidInputException extends Exception {
    private final String description;
    private final String errorCode;
    private final Throwable ex;

    public InvalidInputException(String description, String errorCode, Throwable ex){
        this.description = description;
        this.errorCode = errorCode;
        this.ex = ex;
    }
}
