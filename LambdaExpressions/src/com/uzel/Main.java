package com.uzel;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
         new Thread(() -> {
             //System.out.println("Printing from runnable");
         }).start();

         Employee john = new Employee("John Doe", 30);
         Employee tim = new Employee("Tim Buchalka", 21);
         Employee jack = new Employee("Jack Hill", 40);
         Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new   ArrayList<>();
        employees.add(john);
        employees.add(jack);
        employees.add(tim);
        employees.add(snow);

        Consumer<Employee> detailsPrinter = (Employee employee) -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        };

        employees.forEach(detailsPrinter);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
