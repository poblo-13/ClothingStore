package com.clothingstore.view;

import com.clothingstore.model.Cloth;
import java.util.List;

public class CartView {
    public void showCart(List<Cloth> products, double total) {
        System.out.println("\n---- Contenido del Carrito ----");
        if (products.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Cloth item : products) {
                System.out.printf("- %s | Precio base: $%.2f | Precio final: $%.2f\n",
                        item.type(), item.cost(), item.discount());
            }
            System.out.println("------------------------------");
            System.out.printf("Total a pagar: $%.2f\n", total);
        }
    }
    
    public void showClearCartMessage() {
        System.out.println("El carrito se ha vaciado con éxito.");
    }
}