package com.company;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void steer() {
        System.out.println("Vehicle is steered.");
    }

    public void move() {
        System.out.println("Vehicle is moved.");
    }
}
