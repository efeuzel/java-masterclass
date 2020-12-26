package com.company;

public class Main {

    public static void main(String[] args) {
        Door myDoor = new Door(false, "green");
        Thermostat myThermostat = new Thermostat(25);
        Room myRoom = new Room(myDoor, myThermostat);
        myRoom.getDoor().open();
        myRoom.getThermostat().setSetTemperature(25);
    }
}
