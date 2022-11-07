package com.authentication.exceptions;

public class PasswordMinimumLengthAuthenticationException extends AuthenticationException{
    public PasswordMinimumLengthAuthenticationException(String message) {
        super(message);
    }
}
