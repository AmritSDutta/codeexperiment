package com.authentication.validator;

import com.authentication.exceptions.AuthenticationException;
import com.authentication.rules.AuthenticationRules;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    private List<AuthenticationRules> rulesToBeValidated = new ArrayList<>();

    public boolean validate(String stringToBeValidated){
        boolean response = true;
        for(AuthenticationRules rules: rulesToBeValidated){
            try {
                rules.validate(stringToBeValidated);
            } catch (AuthenticationException e) {
                System.out.printf("Validation failed: " +e.getMessage());
                response = false;
                break;
            }
        }
        return response;
    }

    public void addRules(AuthenticationRules rules){
        rulesToBeValidated.add(rules);
    }
}
