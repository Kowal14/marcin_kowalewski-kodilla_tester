package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings = {"kowal1014", "a1", "Magda1212"})
    public void isUsernameValidate(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc12221kfgjfk", "7", "kowal1014"})
    public void isEmailValidate(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }


}
