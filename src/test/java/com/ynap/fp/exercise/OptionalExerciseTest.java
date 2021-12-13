package com.ynap.fp.exercise;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.ynap.fp.exercise.OptionalExercise.*;
import static org.junit.jupiter.api.Assertions.*;

class OptionalExerciseTest {

    @Test
    void toUppercaseName() {
        String result = OptionalExercise.toUppercaseName(Optional.of(new Person("Andrea", 27)));

        assertEquals("ANDREA", result);
    }

    @Test
    void toUppercaseNameEmpty() {
        String result = OptionalExercise.toUppercaseName(Optional.empty());

        assertEquals("N/A", result);
    }

    @Test
    void toUppercaseName2() {
        Optional<Person> result = OptionalExercise.toUppercaseName2(Optional.of(new Person("Andrea", 27)));

        assertEquals("ANDREA", result.get().getName());
    }

    @Test
    void toUppercaseName2Empty() {
        Optional<Person> expected = Optional.empty();
        Optional<Person> result = OptionalExercise.toUppercaseName2(Optional.empty());

        assertEquals(expected, result);
    }

    @Test
    void checkIfAdult() {
        Optional<Person> result = OptionalExercise.checkIfAdult(Optional.of(new Person("Andrea", 27)));

        assertEquals(27, result.get().getAge());
    }

    @Test
    void checkIfNotAdult() {
        Optional<Person> result = OptionalExercise.checkIfAdult(Optional.of(new Person("Andrea", 17)));

        assertEquals(Optional.empty(), result);
    }

    @Test
    void checkIfAdultEmpty() {
        Optional<Person> result = OptionalExercise.checkIfAdult(Optional.empty());

        assertEquals(Optional.empty(), result);
    }
}