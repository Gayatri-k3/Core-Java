package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Occupation;

public class O_Accessor {
    Occupation occupation;

    public O_Accessor(Occupation occupation) {
        this.occupation = occupation;
        System.out.println("Occupation Accessor Constructor");
    }

    public void show() {
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getExperience());
        System.out.println("Remote?: " + occupation.getRemote());
        System.out.println("Salary: $" + occupation.getSalary());
    }
}
