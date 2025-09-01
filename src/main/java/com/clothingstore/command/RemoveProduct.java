package com.clothingstore.command;

import com.clothingstore.model.ShoppingCart;
import com.clothingstore.model.Cloth;

public class RemoveProduct implements CartOperations {
    
    private final ShoppingCart shoppingCart;
    private final Cloth productToRemove;

    public RemoveProduct(ShoppingCart shoppingCart, Cloth productToRemove) {
        this.shoppingCart = shoppingCart;
        this.productToRemove = productToRemove;
    }

    @Override
    public void execute() {
        shoppingCart.removeProduct(this.productToRemove);
    }
}