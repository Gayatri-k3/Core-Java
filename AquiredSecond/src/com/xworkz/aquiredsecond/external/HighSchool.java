package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.School;

public class HighSchool extends School {
    public HighSchool() {
        super();
        System.out.println("no-arg const of highSchool");
    }

    @Override
    public void teach() {
        System.out.println("running teach in highSchool");
    }

    public void conductExams() {
        System.out.println("running conductExams in highSchool");
    }
}
