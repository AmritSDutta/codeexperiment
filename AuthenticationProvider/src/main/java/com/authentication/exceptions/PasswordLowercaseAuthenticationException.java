package com.authentication.exceptions;

public class PasswordLowercaseAuthenticationException extends AuthenticationException{
    public PasswordLowercaseAuthenticationException(String message) {
        super(message);
    }
}
