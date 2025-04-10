package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Student;

public class CollegeStudent extends Student {
    public CollegeStudent() {
        super();
        System.out.println("no-arg const of collegeStudent");
    }

    @Override
    public void study() {
        System.out.println("running study in collegeStudent");
    }

    public void attendLecture() {
        System.out.println("running attendLecture in collegeStudent");
    }
}
