package com.clothingstore.model;

import com.clothingstore.singleton.DiscountManager;

public class Pants implements Cloth {
    private static final double BASE_PRICE = 15000.00;
    private static final double BASE_DISCOUNT_RATE = 0.2;

    @Override
    public String type() {
        return "Pantalones";
    }

    @Override
    public double cost() {
        return BASE_PRICE;
    }

    @Override
    public double discount() {
        DiscountManager discountPants = DiscountManager.getInstance();
        return discountPants.calculateDiscount(cost(), BASE_DISCOUNT_RATE);
    }
}