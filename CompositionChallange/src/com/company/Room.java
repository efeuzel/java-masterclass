package com.company;

public class Room {
    private Door door;
    private Thermostat thermostat;

    public Room(Door door, Thermostat thermostat) {
        this.door = door;
        this.thermostat = thermostat;
    }

    public Door getDoor() {
        return door;
    }


    public Thermostat getThermostat() {
        return thermostat;
    }

}
