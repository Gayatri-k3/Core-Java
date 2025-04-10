package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Animal;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("no-arg const of dog");
    }

    @Override
    public void makeSound() {
        System.out.println("running makesound in dog");
    }

    public void bark() {
        System.out.println("running bark in dog");
    }
}
