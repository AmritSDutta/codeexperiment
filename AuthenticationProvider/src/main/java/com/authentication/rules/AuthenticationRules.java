package com.authentication.rules;

import com.authentication.exceptions.AuthenticationException;

public abstract class AuthenticationRules {

    public final boolean validate() throws AuthenticationException {
        return checkRule();
    }

    protected boolean checkRule() throws AuthenticationException{
        return false;
    }
}
