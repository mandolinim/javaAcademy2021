package com.ynap.fp.finalex;

import com.ynap.fp.finalex.exercise.Customer;
import com.ynap.fp.finalex.exercise.Item;
import com.ynap.fp.finalex.exercise.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

class OrderHistoryTest {

    @Test
    void showAllItemOfAnExistingOrder() {

        Item item1 = new Item(new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(5));

        Order order1 = new Order("order1", Arrays.asList(item1, item2));
        Order order2 = new Order("order2", Arrays.asList(item2));

        final Customer customer = new Customer(Arrays.asList(
                order1, order2
        ));

        Order orderFound = customer.findOrderById("order1");

        Assertions.assertEquals(Arrays.asList(item1, item2), orderFound.getItems());
    }

    @Test
    void showAllItemOfAnOrderThatDoesNotExist() {

        Item item1 = new Item(new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(5));

        Order order1 = new Order("order1", Arrays.asList(item1, item2));
        Order order2 = new Order("order2", Arrays.asList(item2));

        final Customer customer = new Customer(Arrays.asList(
                order1, order2
        ));

        Order orderFound = customer.findOrderById("order3");

        Assertions.assertEquals(Arrays.asList(), orderFound.getItems());
    }

    @Test
    void TODO_USE_FILTER_OPTIONAL() { //TODO

    }

}
