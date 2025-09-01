package com.clothingstore.view;

import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);
    
    public void showProductsMenu() {
        System.out.println("\n--- Clothing Store - Productos ---");
        System.out.println("1. Agregar Pantalones");
        System.out.println("2. Agregar Poleras");
        System.out.println("3. Volver al menu principal");
        System.out.print("Seleccione una opción: ");
    }
    
    public int getProductOption() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    public void showMessage(String message) {
        System.out.println(message);
    }
}