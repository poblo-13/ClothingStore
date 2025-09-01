package com.clothingstore.command;

import com.clothingstore.model.ShoppingCart;

public class ClearShoppingCart implements CartOperations {
    private final ShoppingCart shoppingCart;

    public ClearShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void execute() {
        shoppingCart.clearCart();
    }
}