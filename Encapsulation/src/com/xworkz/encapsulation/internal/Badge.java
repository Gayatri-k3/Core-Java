package com.xworkz.encapsulation.internal;

public class Badge {
    private String title = "Security Officer";
    private String department = "Defense";
    private int badgeNumber = 1011;
    private String level = "Gold";
    private boolean issued = true;

    public Badge() {
        System.out.println("Badge Constructor");
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    void setLevel(String level) {
        this.level = level;
    }

    void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getBadgeNumber() {
        return this.badgeNumber;
    }

    public String getLevel() {
        return this.level;
    }

    public boolean getIssued() {
        return this.issued;
    }
}

