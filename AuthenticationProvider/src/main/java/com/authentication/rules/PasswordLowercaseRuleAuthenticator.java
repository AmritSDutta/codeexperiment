package com.authentication.rules;

public class PasswordLowercaseRuleAuthenticator extends AuthenticationRules{
    @Override
    protected boolean checkRule(String authenticationString) {
        return false;
    }
}
