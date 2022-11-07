package com.authentication.exceptions;

public class PasswordNumberNotFoundAuthenticationException extends AuthenticationException {
    public PasswordNumberNotFoundAuthenticationException(String message) {
        super(message);
    }
}
