package com.clothingstore.model;

import com.clothingstore.singleton.DiscountManager;

public class Tshirts implements Cloth {
    private static final double BASE_PRICE = 8000.00;
    private static final double BASE_DISCOUNT_RATE = 0.2;

    @Override
    public String type() {
        return "Poleras";
    }

    @Override
    public double cost() {
        return BASE_PRICE;
    }

    @Override
    public double discount() {
        DiscountManager discountTshirts = DiscountManager.getInstance();
        return discountTshirts.calculateDiscount(cost(), BASE_DISCOUNT_RATE);
    }
}