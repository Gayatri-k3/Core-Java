package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Country;

public class India extends Country {
    public India() {
        super();
        System.out.println("no-arg const of india");
    }

    @Override
    public void unite() {
        System.out.println("running unite in india");
    }

    public void celebrateDiversity() {
        System.out.println("running celebrateDiversity in india");
    }
}
