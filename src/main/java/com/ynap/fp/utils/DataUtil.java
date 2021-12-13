package com.ynap.fp.utils;

import com.ynap.fp.exercise.model.Person;

import java.util.Arrays;
import java.util.List;

public class DataUtil {
    public static List<Person> getPersonList() {
        return Arrays.asList(
                new Person("Andrea", 27),
                new Person("Fausto", 17),
                new Person("Michele", 18),
                new Person("Luca", 19),
                new Person("Francesco", 12),
                new Person("Renato", 10)
        );
    }

}
