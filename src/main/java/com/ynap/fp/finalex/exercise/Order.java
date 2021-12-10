package com.ynap.fp.finalex.exercise;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final String id;
    private final List<Item> items;

    public Order(String id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public BigDecimal totalOrder(BigDecimal discount) {
        BigDecimal total = BigDecimal.ZERO;

        for (Item item : items) {
            final BigDecimal totalItem = item.getUnitPrice().subtract(discount);
            total = total.add(totalItem);
        }

        return total;
    }

}
