package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Gym;

public class GYM_Accessor {
    Gym gym;

    public GYM_Accessor(Gym gym) {
        this.gym = gym;
        System.out.println("Gym Accessor Constructor");
    }

    public void show() {
        System.out.println("Name: " + gym.getName());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Open 24x7?: " + gym.getOpen24x7());
        System.out.println("Trainer Name: " + gym.getTrainerName());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}
