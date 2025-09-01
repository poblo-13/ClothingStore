package com.clothingstore.controller;

import com.clothingstore.command.CartOperations;
import com.clothingstore.command.ClearShoppingCart;
import com.clothingstore.model.ShoppingCart;
import com.clothingstore.view.CartView;
import com.clothingstore.view.MainView;
import com.clothingstore.view.ProductView;

public class MainController {
    private final MainView mainView;
    private final ProductController productController;
    private final CartController cartController;
    
    public MainController(MainView mainView, ProductView productView, CartView cartView, ShoppingCart shoppingCart) {
        this.mainView = mainView;
        this.productController = new ProductController(productView, shoppingCart);
        this.cartController = new CartController(cartView, shoppingCart);
    }
    
    public void start() {
        while (true) {
            mainView.showMainMenu();
            int option = mainView.getUserOption();
            
            switch (option) {
                case 1:
                    productController.start();
                    break;
                case 2:
                    cartController.showCartAndOptions();
                    break;
                case 3:
                    cartController.clearCart();
                    break;
                case 4:
                    mainView.showExitMessage();
                    return;
                default:
                    mainView.showInvalidOption();
                    break;
            }
        }
    }
}