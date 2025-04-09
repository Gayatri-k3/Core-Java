package com.xworkz.encapsulation.internal;

public class P_Mutator {
    PostOffice postOffice;

    public P_Mutator(PostOffice postOffice) {
        this.postOffice = postOffice;
        System.out.println("PostOffice Mutator Constructor");
    }

    public void mutator() {
        PostOffice postOffice = new PostOffice();
        postOffice.setLocation("Jayanagar");
        postOffice.setStaffCount(40);
        postOffice.setHead("Mrs. Kavya");
        postOffice.setGovernment(true);
        postOffice.setPinCode("560041");

        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Staff Count: " + postOffice.getStaffCount());
        System.out.println("Head: " + postOffice.getHead());
        System.out.println("Government?: " + postOffice.getGovernment());
        System.out.println("Pin Code: " + postOffice.getPinCode());
    }
}
