package com.uzel;

import java.util.*;

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

        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Employee employee :
                employees) {
            System.out.println(employee.getName());
        }

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
