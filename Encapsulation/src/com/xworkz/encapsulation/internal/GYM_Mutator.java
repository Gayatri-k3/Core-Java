package com.xworkz.encapsulation.internal;

public class GYM_Mutator {
    Gym gym;

    public GYM_Mutator(Gym gym) {
        this.gym = gym;
        System.out.println("Gym Mutator Constructor");
    }

    public void mutator() {
        Gym gym = new Gym();
        gym.setName("Muscle Factory");
        gym.setMembers(150);
        gym.setOpen24x7(false);
        gym.setTrainerName("Sunil");
        gym.setMonthlyFee(999.99);

        System.out.println("Name: " + gym.getName());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Open 24x7?: " + gym.getOpen24x7());
        System.out.println("Trainer Name: " + gym.getTrainerName());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}
