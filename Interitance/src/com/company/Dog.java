package com.company;

public class Dog extends Animal {


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Sub class needs to call the constructor of the super class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //all dogs have brain and body,
        //so no need to take in as input
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog has chewed");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog has walked");
        move(5);
    }

    public void run() {
        System.out.println("Dog has run");
        move(15);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog has moved legs");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving");
        moveLegs(speed);
        super.move(speed);
    }

    //if we call a method in the super class without super keyword, java first looks at
    //the current class for the method and uses if found. otherwise looks at super class.
    //we can use super.method() to directly look at super class's method.
}
