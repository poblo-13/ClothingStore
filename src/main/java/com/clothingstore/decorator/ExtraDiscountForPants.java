package com.clothingstore.decorator;

import com.clothingstore.model.Cloth;
import com.clothingstore.singleton.DiscountManager;

public class ExtraDiscountForPants extends ExtraCloth {
    private static final double EXTRA_DISCOUNT_RATE = 0.5;

    public ExtraDiscountForPants(Cloth cloth) {
        super(cloth);
    }

    @Override
    public double discount() {
        DiscountManager manager = DiscountManager.getInstance();
        return manager.calculateDiscount(cloth.discount(), EXTRA_DISCOUNT_RATE);
    }
}