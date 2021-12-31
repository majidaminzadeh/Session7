package com.tosan.example;

public class Session7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        moveTheAnimal(dog);
        dog.bark();
        moveTheAnimal(cat);
        cat.sleep();
    }

    public static void moveTheAnimal(Animal animal){
        animal.move();
    }
}
