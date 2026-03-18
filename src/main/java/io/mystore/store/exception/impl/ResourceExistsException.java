package io.mystore.store.exception.impl;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceExistsException extends RuntimeException{
    public ResourceExistsException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s with %s already exists: '%s'", resourceName, fieldName, fieldValue));
    }
}
