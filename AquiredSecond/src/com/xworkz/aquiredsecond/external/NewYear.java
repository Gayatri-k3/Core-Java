package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Holiday;

public class NewYear extends Holiday {
    public NewYear() {
        super();
        System.out.println("no-arg const of newYear");
    }

    @Override
    public void relax() {
        System.out.println("running relax in newYear");
    }

    public void countdown() {
        System.out.println("running countdown in newYear");
    }
}
