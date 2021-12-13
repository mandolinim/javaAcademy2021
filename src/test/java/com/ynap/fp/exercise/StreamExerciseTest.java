package com.ynap.fp.exercise;

import com.ynap.fp.exercise.model.Person;
import com.ynap.fp.utils.DataUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StreamExerciseTest {

    @Test
    void filterOutAdultPerson() {
        List<Person> expected = Arrays.asList(
                new Person("Andrea", 27),
                new Person("Michele", 18));
        List<Person> actual = StreamExercise.filterOutAdultPerson(DataUtil.getPersonList());

        assertIterableEquals(expected, actual);
    }

    @Test
    void filterOutUnderAgePerson() {
        List<Person> expected = Arrays.asList(
                new Person("Francesco", 17),
                new Person("Renato", 15));
        List<Person> actual = StreamExercise.filterOutUnderAgePerson(DataUtil.getPersonList());

        assertIterableEquals(expected, actual);
    }

    @Test
    void getOldestPerson() {
        Optional<Person> expected = Optional.of(new Person("Andrea", 27));
        Optional<Person> actual = StreamExercise.getOldestPerson(DataUtil.getPersonList());

        assertEquals(expected, actual);
    }

    @Test
    void getOldestPersonEmpty() {
        Optional<Person> actual = StreamExercise.getOldestPerson(Collections.emptyList());

        assertEquals(Optional.empty(), actual);
    }

    @Test
    void concatNameByComma() {
        String expected = "Andrea,Fausto,Michele,Luca,Francesco,Renato,";
        String actual = StreamExercise.concatNameByComma(DataUtil.getPersonList());

        assertEquals(expected, actual);
    }
}