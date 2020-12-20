package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(int x, int y) {
        double deltaX = this.getX() - x;
        double deltaY = this.getY() - y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public double distance(Point p) {
        double deltaX = this.getX() - p.getX();
        double deltaY = this.getY() - p.getY();
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
}
