package com.company;

public class Rapid extends Car {

    private int productionYear;

    public Rapid(String name, int productionYear) {
        super(name);
        this.productionYear = productionYear;
    }

    public void getProductionYear() {
        System.out.println("Rapid production tear is " + productionYear);
    }
}
