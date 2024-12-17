package com.github.murilonerdx.userapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
