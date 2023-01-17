package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

public class GamblingMachineTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv",lineSeparator = ";")
    public void shouldValidateNumbers() {}
}
