//package com.ynap.fp.finalex;
//
//import com.ynap.fp.finalex.exercise.Customer;
//import com.ynap.fp.finalex.exercise.Order;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class CustomerTest {
//    @Test
//    public void findOrderNotFound() {
//        final Customer customer = new Customer(Arrays.asList(
//                new Order("order1", Collections.emptyList()),
//                new Order("order3", Collections.emptyList())
//        ));
//
//        assertFalse(customer.findOrderById("order2").isPresent());
//    }
//
//    @Test
//    public void findOrderFound() {
//        final Customer customer = new Customer(Arrays.asList(
//                new Order("order1", Collections.emptyList()),
//                new Order("order2", Collections.emptyList()),
//                new Order("order3", Collections.emptyList())
//        ));
//
//        assertTrue(customer.findOrderById("order2").isPresent());
//    }
//
//    @Test
//    public void test() {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> stream = list.stream();
//        Stream<Integer> modifiedStream = stream.map(x -> x * 2);
//    }
//
//}