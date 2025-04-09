package com.xworkz.encapsulation.internal;

public class KeyChain {
    private String material = "Metal";
    private int keys = 5;
    private String brand = "KeyMaster";
    private String color = "Black";
    private boolean customized = false;

    public KeyChain() {
        System.out.println("KeyChain Constructor");
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setKeys(int keys) {
        this.keys = keys;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setCustomized(boolean customized) {
        this.customized = customized;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getKeys() {
        return this.keys;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getCustomized() {
        return this.customized;
    }
}

