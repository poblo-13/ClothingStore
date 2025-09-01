package com.clothingstore.singleton;

public class DiscountManager {
    private static volatile DiscountManager instance;
    
    private DiscountManager() { }

    public static DiscountManager getInstance() {
        if (instance == null) {
            synchronized (DiscountManager.class) {
                if (instance == null) {
                    instance = new DiscountManager();
                }
            }
        }
        return instance;
    }
    
    public double calculateDiscount(double price, double percentage) {
        double discountAmount = price * percentage;
        return price - discountAmount;
    }
}