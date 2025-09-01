package com.clothingstore.command;

import com.clothingstore.model.Cloth;
import com.clothingstore.model.ShoppingCart;

public class AddNewProduct implements CartOperations {
    private final ShoppingCart shoppingCart;
    private final Cloth productToAdd;

    public AddNewProduct(ShoppingCart shoppingCart, Cloth productToAdd) {
        this.shoppingCart = shoppingCart;
        this.productToAdd = productToAdd;
    }

    @Override
    public void execute() {
        shoppingCart.addProduct(this.productToAdd);
    }
}