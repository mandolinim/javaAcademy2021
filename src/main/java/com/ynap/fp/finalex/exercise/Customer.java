package com.ynap.fp.finalex.exercise;

import java.math.BigDecimal;
import java.util.List;

public class Customer {
    private final List<Order> orders;
    private BigDecimal discount;

    public Customer(List<Order> orders) {
        this.orders = orders;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public Order findOrderById(String orderId) {
        for (Order order : orders)
            if (orderId.equals(order.getId()))
                return order;
        return null;
    }
}