package com.clothingstore.main;

import com.clothingstore.controller.MainController;
import com.clothingstore.model.ShoppingCart;
import com.clothingstore.view.CartView;
import com.clothingstore.view.MainView;
import com.clothingstore.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        MainView mainView = new MainView();
        ProductView productView = new ProductView();
        CartView cartView = new CartView();
        MainController controller = new MainController(mainView, productView, cartView, cart);
        
        controller.start();
    }
}