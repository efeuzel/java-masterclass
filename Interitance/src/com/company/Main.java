package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("animal", 1, 1, 5, 5);

	    Dog dog = new Dog("Yorkie", 8,20,2,4,1, 20, "Silky");

	    dog.eat(); //not defined in Dog but in Animal
		dog.walk();
		dog.run();

		Fish fish = new Fish("Dory",2,1,1,2,3);
		fish.move(5);
    }
}
