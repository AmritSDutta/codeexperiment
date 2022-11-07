package com.authentication.rules;

import com.authentication.exceptions.AuthenticationException;
import com.authentication.exceptions.PasswordLowercaseAuthenticationException;

public class PasswordLowercaseRuleAuthenticator extends AuthenticationRules{
    @Override
    protected boolean checkRule(String authenticationString) throws AuthenticationException {
        if(authenticationString.matches(".*[a-z].*")) {
            return true;
        } else {
            throw new PasswordLowercaseAuthenticationException("No lowercase letter found");
        }
    }
}
