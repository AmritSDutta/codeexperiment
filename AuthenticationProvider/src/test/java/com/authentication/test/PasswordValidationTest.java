package com.authentication.test;

import com.authentication.rules.PasswordLengthRuleAuthenticator;
import com.authentication.validator.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {

    @Test
    public void testPasswordValidator(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate("test");
    }

    @Test
    public void testPasswordValidatorMinimumLength(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordLengthRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test");
        Assert.assertFalse(isValid);
    }
}
