package com.ynap.fp.slides;

import com.ynap.fp.exercise.EvenAverageCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenAverageCalculatorTest {

    /*
     * Exercise:
     * GIVEN: A List of integer
     * RETURN: The average of only even numbers
     *
     * 1- Create red tests
     * 2- Implement logic
     * 3- Make test green
     * 4- Refactor logic
     */
    @Test
    void integerEvenAverageTest() {

        //Integer numbers
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Assert that result is equals to 6
        Assertions.assertEquals(6.0, EvenAverageCalculator.compute(ls));
    }
}