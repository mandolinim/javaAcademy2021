package com.ynap.fp.finalex.exercise;

import java.math.BigDecimal;
import java.util.Optional;

public class Item {
    private final BigDecimal unitPrice;

    public Item(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
}
