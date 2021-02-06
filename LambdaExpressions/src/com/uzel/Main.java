package com.uzel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            //System.out.println("Printing from runnable");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jack);
        employees.add(tim);
        employees.add(snow);

        Consumer<Employee> detailsPrinter = (Employee employee) -> {
            System.out.print(employee.getName() + " aged ");
            System.out.println(employee.getAge());
        };

        System.out.println("Listing all employees:");
        employees.forEach(detailsPrinter);

        printEmployeesByAge(employees, "Employees over 30",
                employee -> employee.getAge() > 30);

        printEmployeesByAge(employees, "Employees 30 and under",
                employee -> employee.getAge() <= 30);

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }
    }


    private static void printEmployeesByAge(List<Employee> employees,
                                            String explanation,
                                            Predicate<Employee> ageCondition) {
        System.out.println(explanation);
        AtomicInteger i = new AtomicInteger(1);
        employees.forEach(employee -> {
            if (ageCondition.test(employee)) System.out.println("\t" + i.getAndIncrement() + ". " + employee.getName());
        });
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
