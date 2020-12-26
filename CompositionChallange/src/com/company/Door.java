package com.company;

public class Door {
    private boolean isOpen;
    private String color;

    public Door(boolean isOpen, String color) {
        this.isOpen = isOpen;
        this.color = color;
    }

    public void open() {
        isOpen = true;
        System.out.println("The door is open");
    }


    public String getColor() {
        return color;
    }

}
