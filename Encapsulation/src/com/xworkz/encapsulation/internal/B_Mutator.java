package com.xworkz.encapsulation.internal;

public class B_Mutator {
    Badge badge;

    public B_Mutator(Badge badge) {
        this.badge = badge;
        System.out.println("Badge Mutator Constructor");
    }

    public void mutator() {
        Badge badge = new Badge();
        badge.setTitle("Special Agent");
        badge.setDepartment("Intelligence");
        badge.setBadgeNumber(2024);
        badge.setLevel("Platinum");
        badge.setIssued(false);

        System.out.println("Title: " + badge.getTitle());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Badge Number: " + badge.getBadgeNumber());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Issued?: " + badge.getIssued());
    }
}
