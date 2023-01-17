package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providesDoublesForCalculatingBmi() {
        return Stream.of(
                Arguments.of(1.85, 85.2, "Normal (healthy weight)"));


    }
}
