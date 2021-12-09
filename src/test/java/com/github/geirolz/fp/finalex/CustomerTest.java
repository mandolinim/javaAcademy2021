package com.github.geirolz.fp.finalex;

import com.github.geirolz.fp.finalex.exercise.Customer;
import com.github.geirolz.fp.finalex.exercise.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    public void findOrderNotFound() {
        final Customer customer = new Customer(Arrays.asList(
                new Order("order1", Collections.emptyList()),
                new Order("order3", Collections.emptyList())
        ));

        assertFalse(customer.findOrderById("order2").isPresent());
    }

    @Test
    public void findOrderFound() {
        final Customer customer = new Customer(Arrays.asList(
                new Order("order1", Collections.emptyList()),
                new Order("order2", Collections.emptyList()),
                new Order("order3", Collections.emptyList())
        ));

        assertTrue(customer.findOrderById("order2").isPresent());
    }

    @Test
    public void test(){
        Optional<Integer> some = Optional.ofNullable(5);
        Optional<String> someString = some.map(v -> v.toString());
        assertTrue(someString.isPresent());
        assertEquals(someString.get(), "5");

        Optional<String> none = Optional.ofNullable(null);
        assertFalse(none.isPresent());
    }

}