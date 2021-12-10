package com.ynap.fp.finalex;

import com.ynap.fp.finalex.exercise.Customer;
import com.ynap.fp.finalex.exercise.Item;
import com.ynap.fp.finalex.exercise.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

class DiscountTest {

    @Test
    void calculateTotalOrderWithDiscount() {

        Item item1 = new Item(new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(5));

        final Customer customer = new Customer(Arrays.asList(
                new Order("order1", Arrays.asList(item1, item2))
        ));
        customer.setDiscount(new BigDecimal(2));

        Order order1 = customer.findOrderById("order1");
        BigDecimal total = order1.totalOrder(customer.getDiscount());

        Assertions.assertEquals(new BigDecimal(11), total);
    }

    @Test
    void calculateTotalOrderWithoutDiscount() {

        Item item1 = new Item(new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(5));

        final Customer customer = new Customer(Arrays.asList(
                new Order("order1", Arrays.asList(item1, item2))
        ));

        Order order1 = customer.findOrderById("order1");
        BigDecimal total = order1.totalOrder(customer.getDiscount());

        Assertions.assertEquals(new BigDecimal(11), total);
    }
}
