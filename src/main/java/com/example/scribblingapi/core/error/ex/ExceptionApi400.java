package com.example.scribblingapi.core.error.ex;

public class ExceptionApi400 extends RuntimeException {
    public ExceptionApi400(String message) {
        super(message);
    }
}