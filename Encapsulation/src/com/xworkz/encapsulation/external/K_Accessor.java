package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.KeyChain;

public class K_Accessor {
    KeyChain keyChain;

    public K_Accessor(KeyChain keyChain) {
        this.keyChain = keyChain;
        System.out.println("KeyChain Accessor Constructor");
    }

    public void show() {
        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Keys: " + keyChain.getKeys());
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Customized?: " + keyChain.getCustomized());
    }
}
