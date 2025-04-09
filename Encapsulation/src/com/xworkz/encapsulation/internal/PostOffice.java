package com.xworkz.encapsulation.internal;

public class PostOffice {
    private String location = "MG Road";
    private int staffCount = 25;
    private String head = "Mr. Rajesh";
    private boolean government = true;
    private String pinCode = "560001";

    public PostOffice() {
        System.out.println("PostOffice Constructor");
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    void setHead(String head) {
        this.head = head;
    }

    void setGovernment(boolean government) {
        this.government = government;
    }

    void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getLocation() {
        return this.location;
    }

    public int getStaffCount() {
        return this.staffCount;
    }

    public String getHead() {
        return this.head;
    }

    public boolean getGovernment() {
        return this.government;
    }

    public String getPinCode() {
        return this.pinCode;
    }
}
