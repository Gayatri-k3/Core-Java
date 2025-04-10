package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Hospital;

public class ChildrenHospital extends Hospital {
    public ChildrenHospital() {
        super();
        System.out.println("no-arg const of childrenHospital");
    }

    @Override
    public void treat() {
        System.out.println("running treat in childrenHospital");
    }

    public void careForKids() {
        System.out.println("running careForKids in childrenHospital");
    }
}
