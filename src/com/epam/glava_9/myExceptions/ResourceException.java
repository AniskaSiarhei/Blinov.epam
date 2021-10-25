package com.epam.glava_9.myExceptions;

public class ResourceException extends Exception{
    public ResourceException() {
    }

    public ResourceException(String message) {
        super(message);
    }

    public ResourceException(Throwable cause) {
        super(cause);
    }

    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
