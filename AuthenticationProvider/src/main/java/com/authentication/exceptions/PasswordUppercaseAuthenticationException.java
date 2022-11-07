package com.authentication.exceptions;

public class PasswordUppercaseAuthenticationException extends AuthenticationException{

    public PasswordUppercaseAuthenticationException(String message) {
        super(message);
    }
}
