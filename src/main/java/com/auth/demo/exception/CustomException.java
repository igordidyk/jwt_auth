package com.auth.demo.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class CustomException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 2487293096141891374L;

    private final String message;
    private final HttpStatus status;

    public CustomException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
