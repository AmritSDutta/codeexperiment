package com.authentication.test;

import com.authentication.rules.PasswordLengthRuleAuthenticator;
import com.authentication.rules.PasswordLowercaseRuleAuthenticator;
import com.authentication.rules.PasswordNotNullRuleAuthenticator;
import com.authentication.rules.PasswordUppercaseRuleAuthenticator;
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
    public void testPasswordValidatorNoMinimumLength(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordLengthRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test");
        Assert.assertFalse(isValid);
    }

    @Test
    public void testPasswordValidatorMinimumLength(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordLengthRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test@1234");
        Assert.assertTrue(isValid);
    }

    @Test
    public void testPasswordValidatorLowercase(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordLowercaseRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test");
        Assert.assertTrue(isValid);
    }

    @Test
    public void testPasswordValidatorNoLowercase(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordLowercaseRuleAuthenticator());
        boolean isValid = passwordValidator.validate("TEST");
        Assert.assertFalse(isValid);
    }

    @Test
    public void testPasswordValidatorUppercase(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordUppercaseRuleAuthenticator());
        boolean isValid = passwordValidator.validate("Test");
        Assert.assertTrue(isValid);
    }

    @Test
    public void testPasswordValidatorNoUppercase(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordUppercaseRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test");
        Assert.assertFalse(isValid);
    }

    @Test
    public void testPasswordValidatorNotNull(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordNotNullRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test");
        Assert.assertTrue(isValid);
    }

    @Test
    public void testPasswordValidatorNull(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordNotNullRuleAuthenticator());
        boolean isValid = passwordValidator.validate(null);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testPasswordValidatorWithNumber(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordNotNullRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test1");
        Assert.assertTrue(isValid);
    }
    @Test
    public void testPasswordValidatorWithoutNumber(){
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.addRules(new PasswordNotNullRuleAuthenticator());
        boolean isValid = passwordValidator.validate("test");
        Assert.assertTrue(isValid);
    }






}
