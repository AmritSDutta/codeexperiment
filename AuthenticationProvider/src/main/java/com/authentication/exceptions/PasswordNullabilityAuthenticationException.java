package com.authentication.exceptions;

public class PasswordNullabilityAuthenticationException extends AuthenticationException{
    public PasswordNullabilityAuthenticationException(String message) {
        super(message);
    }
}
