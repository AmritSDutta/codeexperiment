package com.authentication.rules;

import com.authentication.exceptions.AuthenticationException;

public abstract class AuthenticationRules {

    public final boolean validate(String authenticationString) throws AuthenticationException {
        return checkRule(authenticationString);
    }

    protected abstract boolean checkRule(String authenticationString) throws AuthenticationException;
}
