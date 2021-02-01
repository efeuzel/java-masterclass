package com.company;

public class BasketballPlayer extends Player{
    private double jumpHeight;
    private int totalFaults;

    public double getJumpHeight() {
        return jumpHeight;
    }
    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getTotalFaults() {
        return totalFaults;
    }

    public void setTotalFaults(int totalFaults) {
        this.totalFaults = totalFaults;
    }
}
