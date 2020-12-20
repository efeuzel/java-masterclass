package com.company;

import java.util.Locale;

public class Car { //statement to create a class name Car
    //class or member variables are called fields, fields define
    // the state of the object
    //internal workings object is controlled by private fields

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}

