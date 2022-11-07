package com.authentication.rules;

public class PasswordNumberRuleAuthenticator extends   AuthenticationRules{
    @Override
    protected boolean checkRule(String authenticationString) {
        return false;
    }
}
