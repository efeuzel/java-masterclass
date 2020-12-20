package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public boolean isTeen() {
        if(age > 12 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        String fullName = "";
        if(!firstName.isEmpty()){
            if(!lastName.isEmpty()){
                fullName += firstName + " " + lastName;
            } else {
                fullName = firstName;
            }
        } else {
            fullName = lastName;
        }
        return fullName;
    }
}
