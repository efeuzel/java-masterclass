package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        //porsche.model = "Carrera"; //violates the rule of encapsulation
        System.out.println("Porsche model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Porsche model is " + porsche.getModel());

    }
}
