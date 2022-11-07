package com.authentication.validator;

import com.authentication.exceptions.AuthenticationException;
import com.authentication.rules.AuthenticationRules;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    private List<AuthenticationRules> rulesToBeValidated = new ArrayList<>();

    public boolean validate(String stringToBeValidated){
        for(AuthenticationRules rules: rulesToBeValidated){
            try {
                rules.validate(stringToBeValidated);
            } catch (AuthenticationException e) {
                System.out.printf("Validation failed: " +e.getMessage());
                return false;
            }
        }
        return true;
    }

    public void addRules(AuthenticationRules rules){
        rulesToBeValidated.add(rules);
    }
}
