package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Person;

public class Child extends Person {
    public Child(){
        super();
        System.out.println("no-arg const of child");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep in child");
    }
    public void talk(){
        System.out.println("running talk in child");
    }

}
