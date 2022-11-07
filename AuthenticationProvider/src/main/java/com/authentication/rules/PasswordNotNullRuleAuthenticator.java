package com.authentication.rules;

import com.authentication.exceptions.AuthenticationException;
import com.authentication.exceptions.PasswordMinimumLengthAuthenticationException;
import com.authentication.exceptions.PasswordNullabilityAuthenticationException;

public class PasswordNotNullRuleAuthenticator extends AuthenticationRules{
    @Override
    protected boolean checkRule(String authenticationString) throws AuthenticationException {
        if( authenticationString != null || authenticationString.trim().length() > 0){
            return true;
        } else {
            throw new PasswordNullabilityAuthenticationException("Password is null");
        }
    }
}
