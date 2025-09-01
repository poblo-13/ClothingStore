package com.clothingstore.view;

import java.util.Scanner;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        System.out.println("\n---- DUOC Clothing Store ----");
        System.out.println("1. Ir a la tienda de productos");
        System.out.println("2. Ver carrito");
        System.out.println("3. Vaciar carrito");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    public int getUserOption() {
        try {
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            scanner.next(); // Clear the invalid input
            return -1;
        }
    }
    
    public void showExitMessage() {
        System.out.println("Gracias por su compra.");
    }

    public void showInvalidOption() {
        System.out.println("Opción no válida. Por favor, intente de nuevo.");
    }
}