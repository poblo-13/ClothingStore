package com.clothingstore.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Cloth> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Cloth product) {
        this.products.add(product);
    }

    public void removeProduct(Cloth product) {
        this.products.remove(product);
    }
    
    public void clearCart() {
        this.products.clear();
    }
    
    public List<Cloth> getProducts() {
        return this.products;
    }
    
    public double calculateTotal() {
        return this.products.stream()
            .mapToDouble(Cloth::discount)
            .sum();
    }
}