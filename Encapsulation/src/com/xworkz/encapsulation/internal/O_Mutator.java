package com.xworkz.encapsulation.internal;

public class O_Mutator {
    Occupation occupation;

    public O_Mutator(Occupation occupation) {
        this.occupation = occupation;
        System.out.println("Occupation Mutator Constructor");
    }

    public void mutator() {
        Occupation occupation = new Occupation();
        occupation.setTitle("Data Scientist");
        occupation.setIndustry("AI & ML");
        occupation.setExperience(3);
        occupation.setRemote(true);
        occupation.setSalary(95000.0);

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getExperience());
        System.out.println("Remote?: " + occupation.getRemote());
        System.out.println("Salary: $" + occupation.getSalary());
    }
}
