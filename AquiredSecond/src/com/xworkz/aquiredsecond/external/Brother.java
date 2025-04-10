package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Sibling;

public class Brother extends Sibling {
    public Brother() {
        super();
        System.out.println("no-arg const of brother");
    }

    @Override
    public void growUpTogether() {
        System.out.println("running growUpTogether in brother");
    }

    public void protect() {
        System.out.println("running protect in brother");
    }
}
