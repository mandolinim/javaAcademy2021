package com.ynap.fp.exercise;

import java.util.Optional;

public class OptionalExercise {

    public static class Person {
        private final String name;
        private final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

    public static String toUppercaseName(Optional<Person> person) {

        //TODO return the updated name with uppercase or N/A
        return null;
    }

    public static Optional<Person> toUppercaseName2(Optional<Person> person) {

        //TODO return the updated Person with uppercase name
        return null;
    }

    public static Optional<Person> checkIfAdult(Optional<Person> person) {

        //TODO return Person if age greater than 18
        return null;
    }


}
