package com.clothingstore.controller;

import com.clothingstore.command.CartOperations;
import com.clothingstore.command.ClearShoppingCart;
import com.clothingstore.model.ShoppingCart;
import com.clothingstore.view.CartView;

public class CartController {
    private final CartView cartView;
    private final ShoppingCart shoppingCart;

    public CartController(CartView cartView, ShoppingCart shoppingCart) {
        this.cartView = cartView;
        this.shoppingCart = shoppingCart;
    }

    public void showCartAndOptions() {
        cartView.showCart(shoppingCart.getProducts(), shoppingCart.calculateTotal());
    }

    public void clearCart() {
        CartOperations clearCartCommand = new ClearShoppingCart(shoppingCart);
        clearCartCommand.execute();
        cartView.showClearCartMessage();
    }
}