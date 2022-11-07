package com.authentication.rules;

import com.authentication.exceptions.AuthenticationException;
import com.authentication.exceptions.PasswordNumberNotFoundAuthenticationException;

public class PasswordNumberRuleAuthenticator extends   AuthenticationRules{
    @Override
    protected boolean checkRule(String authenticationString)  throws AuthenticationException {
        if(authenticationString.matches(".*[1-9].*")) {
            return true;
        } else {
            throw new PasswordNumberNotFoundAuthenticationException("No number found");
        }
    }
}
