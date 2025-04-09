package com.xworkz.encapsulation.internal;

public class Gym {
    private String name = "PowerHouse";
    private int members = 100;
    private boolean open24x7 = true;
    private String trainerName = "Amit";
    private double monthlyFee = 1200.0;

    public Gym() {
        System.out.println("Gym Constructor");
    }

    void setName(String name) {
        this.name = name;
    }

    void setMembers(int members) {
        this.members = members;
    }

    void setOpen24x7(boolean open24x7) {
        this.open24x7 = open24x7;
    }

    void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getName() {
        return this.name;
    }

    public int getMembers() {
        return this.members;
    }

    public boolean getOpen24x7() {
        return this.open24x7;
    }

    public String getTrainerName() {
        return this.trainerName;
    }

    public double getMonthlyFee() {
        return this.monthlyFee;
    }
}
