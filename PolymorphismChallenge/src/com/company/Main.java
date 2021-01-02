package com.company;
import com.company.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, "Generic Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford f = new Ford(6, "f430");
        System.out.println(f.accelerate());

    }


}
