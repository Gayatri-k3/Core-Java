package com.xworkz.acquired.Runner;

import com.xworkz.acquired.external.*;
import com.xworkz.acquired.internal.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Sneaker is a Shoe is a Accessory");
        Accessory accessory = new NikeShoe();
        System.out.println("---------------------");
        Shoe shoe = new NikeShoe();
        System.out.println("---------------------");
        NikeShoe nikeShoe = new NikeShoe();
        System.out.println();


        System.out.println("GoodDayBiscuit is a Biscuit is a Snack is a Food");
        Food food = new GoodDayBiscuit();
        System.out.println("---------------------");
        Snack snack = new GoodDayBiscuit();
        System.out.println("---------------------");
        Biscuit biscuit = new GoodDayBiscuit();
        System.out.println("---------------------");
        GoodDayBiscuit goodDayBiscuit = new GoodDayBiscuit();
        System.out.println();

        System.out.println("Tap is a Academy is a Organization");
        Organization organization = new Tap();
        System.out.println("---------------------");
        Academy academy = new Tap();
        System.out.println("---------------------");
        Tap tap = new Tap();
        System.out.println();

        System.out.println("Omelette is a SideDish is a Dish");
        Dish dish = new Omelette();
        System.out.println("---------------------");
        SideDish sideDish = new Omelette();
        System.out.println("---------------------");
        Omelette omelette = new Omelette();
        System.out.println();

        System.out.println("Actor is a Person is a Human");
        Human human = new Actor();
        System.out.println("---------------------");
        Person person = new Actor();
        System.out.println("---------------------");
        Actor actor = new Actor();
        System.out.println();

        System.out.println("Revolver is a Weapon is a Tool");
        Tool tool = new Revolver();
        System.out.println("---------------------");
        Weapon weapon = new Revolver();
        System.out.println("---------------------");
        Revolver revolver = new Revolver();
        System.out.println();

        System.out.println("Cactus is a Plant is a Thing");
        Thing thing = new Cactus();
        System.out.println("---------------------");
        Plant plant = new Cactus();
        System.out.println("---------------------");
        Cactus cactus = new Cactus();
        System.out.println();

        System.out.println("Thread is a Cotton is a Material");
        Material material = new Threads();
        System.out.println("---------------------");
        Cotton cotton = new Threads();
        System.out.println("---------------------");
        Threads thread = new Threads();
        System.out.println();

        System.out.println("Lock is a Security");
        Security security = new Lock();
        System.out.println("---------------------");
        Lock lock = new Lock();
        System.out.println();

        System.out.println("LED is a Light");
        Light light = new LED();
        System.out.println("---------------------");
        LED led = new LED();
        System.out.println();

        System.out.println("Sofa is a Furniture is a Product");
        Product product = new Sofa();
        System.out.println("---------------------");
        Furniture furniture = new Sofa();
        System.out.println("---------------------");
        Sofa sofa = new Sofa();
        System.out.println();
    }
}