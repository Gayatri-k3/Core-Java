package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.PostOffice;

public class P_Accessor {
    PostOffice postOffice;

    public P_Accessor(PostOffice postOffice) {
        this.postOffice = postOffice;
        System.out.println("PostOffice Accessor Constructor");
    }

    public void show() {
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Staff Count: " + postOffice.getStaffCount());
        System.out.println("Head: " + postOffice.getHead());
        System.out.println("Government?: " + postOffice.getGovernment());
        System.out.println("Pin Code: " + postOffice.getPinCode());
    }
}
