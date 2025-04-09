package com.xworkz.encapsulation.internal;

public class K_Mutator {
    KeyChain keyChain;

    public K_Mutator(KeyChain keyChain) {
        this.keyChain = keyChain;
        System.out.println("KeyChain Mutator Constructor");
    }

    public void mutator() {
        KeyChain keyChain = new KeyChain();
        keyChain.setMaterial("Leather");
        keyChain.setKeys(3);
        keyChain.setBrand("LeatherCraft");
        keyChain.setColor("Brown");
        keyChain.setCustomized(true);

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Keys: " + keyChain.getKeys());
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Customized?: " + keyChain.getCustomized());
    }
}

