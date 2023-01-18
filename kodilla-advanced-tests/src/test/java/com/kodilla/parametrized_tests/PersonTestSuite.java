package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {





    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSources#providesDoublesForCalculatingBmi")
    public void shouldCalculateBmi(double heightInMetres, double weightInKilogram, String expectedResult) {
        Person person = new Person(heightInMetres, weightInKilogram);
        assertEquals(expectedResult, person.getBMI());

    }
}
