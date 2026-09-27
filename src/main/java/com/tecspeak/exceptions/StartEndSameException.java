package com.tecspeak.exceptions;

public class StartEndSameException extends RuntimeException{
    public StartEndSameException(String message) {
        super(message);
    }
    public StartEndSameException(String message, Throwable e){
        super(message,e);
    }
}
