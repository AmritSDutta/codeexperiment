package com.authentication.rules;

import com.authentication.exceptions.PasswordUppercaseAuthenticationException;

public class PasswordUppercaseRuleAuthenticator extends AuthenticationRules{
    @Override
    protected boolean checkRule(String authenticationString)  throws PasswordUppercaseAuthenticationException {
        if(authenticationString.matches(".*[A-Z].*")) {
            return true;
        } else {
            throw new PasswordUppercaseAuthenticationException("No uppercase letter found");
        }
    }
}
