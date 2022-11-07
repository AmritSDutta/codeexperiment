package com.authentication.rules;

import com.authentication.exceptions.AuthenticationException;
import com.authentication.exceptions.PasswordMinimumLengthAuthenticationException;

public class PasswordLengthRuleAuthenticator extends AuthenticationRules{
    private int length =8;
    @Override
    protected boolean checkRule(String authenticationString) throws AuthenticationException {
        if(authenticationString!= null && authenticationString.trim().length() >= 8){
            return true;
        } else {
            throw new PasswordMinimumLengthAuthenticationException("Password must be of length equal or more than :"+ length);
        }
    }
}
