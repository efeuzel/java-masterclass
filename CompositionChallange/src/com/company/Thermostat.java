package com.company;

public class Thermostat {
    private double setTemperature;

    public Thermostat(double setTemperature) {
        this.setTemperature = setTemperature;
    }

    public double getSetTemperature() {
        return setTemperature;
    }

    public void setSetTemperature(double setTemperature) {
        this.setTemperature = setTemperature;
        System.out.println("New temperature is " + setTemperature);
    }
}
