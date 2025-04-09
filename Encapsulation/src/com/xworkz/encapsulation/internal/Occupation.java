package com.xworkz.encapsulation.internal;

public class Occupation {
    private String title = "Engineer";
    private String industry = "Software";
    private int experience = 5;
    private boolean remote = false;
    private double salary = 75000.0;

    public Occupation() {
        System.out.println("Occupation Constructor");
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    void setRemote(boolean remote) {
        this.remote = remote;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return this.title;
    }

    public String getIndustry() {
        return this.industry;
    }

    public int getExperience() {
        return this.experience;
    }

    public boolean getRemote() {
        return this.remote;
    }

    public double getSalary() {
        return this.salary;
    }
}
