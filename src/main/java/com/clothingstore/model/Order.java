package com.clothingstore.model;

public class Order {
    private final ShoppingCart cart;
    private final User user;

    public Order(User user, ShoppingCart cart) {
        this.user = user;
        this.cart = cart;
    }

    public ShoppingCart getCart() {
        return cart;
    }
    
    public User getUser() {
        return user;
    }
}