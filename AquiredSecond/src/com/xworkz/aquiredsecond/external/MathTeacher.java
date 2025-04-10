package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Teacher;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        super();
        System.out.println("no-arg const of math teacher");
    }

    @Override
    public void teach() {
        System.out.println("running teach in math teacher");
    }

    public void solveEquation() {
        System.out.println("running solveEquation in math teacher");
    }
}
