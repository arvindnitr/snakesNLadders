package com.arvind.lld.snakeNladder;

public class InvalidInitializationException extends Exception {

    public InvalidInitializationException() {
        throw new RuntimeException("Invalid initialization");
    }
}
