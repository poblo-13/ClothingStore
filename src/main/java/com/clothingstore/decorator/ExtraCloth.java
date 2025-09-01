package com.clothingstore.decorator;

import com.clothingstore.model.Cloth;

public abstract class ExtraCloth implements Cloth {
    protected final Cloth cloth;

    public ExtraCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    @Override
    public String type() {
        return cloth.type();
    }

    @Override
    public double cost() {
        return cloth.cost();
    }

    @Override
    public double discount() {
        return cloth.discount();
    }
}