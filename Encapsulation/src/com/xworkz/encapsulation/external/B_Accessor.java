package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Badge;

public class B_Accessor {
    Badge badge;

    public B_Accessor(Badge badge) {
        this.badge = badge;
        System.out.println("Badge Accessor Constructor");
    }

    public void show() {
        System.out.println("Title: " + badge.getTitle());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Badge Number: " + badge.getBadgeNumber());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Issued?: " + badge.getIssued());
    }
}
