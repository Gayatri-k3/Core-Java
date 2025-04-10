package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Cartoon;

public class TomAndJerry extends Cartoon {
    public TomAndJerry() {
        super();
        System.out.println("no-arg const of tomAndJerry");
    }

    @Override
    public void entertain() {
        System.out.println("running entertain in tomAndJerry");
    }

    public void chase() {
        System.out.println("running chase in tomAndJerry");
    }
}
