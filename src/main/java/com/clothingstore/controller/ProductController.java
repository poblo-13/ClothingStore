package com.clothingstore.controller;

import com.clothingstore.command.AddNewProduct;
import com.clothingstore.command.CartOperations;
import com.clothingstore.decorator.ExtraDiscountForPants;
import com.clothingstore.decorator.ExtraDiscountForTshirts;
import com.clothingstore.model.Cloth;
import com.clothingstore.model.Pants;
import com.clothingstore.model.ShoppingCart;
import com.clothingstore.model.Tshirts;
import com.clothingstore.view.ProductView;

public class ProductController {
    private final ProductView view;
    private final ShoppingCart shoppingCart;
    
    public ProductController(ProductView view, ShoppingCart shoppingCart) {
        this.view = view;
        this.shoppingCart = shoppingCart;
    }
    
    public void start() {
        while(true) {
            view.showProductsMenu();
            int option = view.getProductOption();
            
            if (option == 3) {
                break;
            }
            
            handleProductSelection(option);
        }
    }
    
    private void handleProductSelection(int option) {
        Cloth product = null;
        
        switch(option) {
            case 1:
                product = new Pants();
                if (shoppingCart.getProducts().stream().anyMatch(item -> item instanceof Pants)) {
                    product = new ExtraDiscountForPants(product);
                }
                break;
            case 2:
                product = new Tshirts();
                if (shoppingCart.getProducts().stream().anyMatch(item -> item instanceof Tshirts)) {
                    product = new ExtraDiscountForTshirts(product);
                }
                break;
            default:
                view.showMessage("Opción no válida.");
                return;
        }
        
        if (product != null) {
            CartOperations addProductCommand = new AddNewProduct(shoppingCart, product);
            addProductCommand.execute();
            view.showMessage("Producto agregado exitosamente.");
        }
    }
}