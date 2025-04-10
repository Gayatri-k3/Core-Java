package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Software;

public class Antivirus extends Software {
    public Antivirus() {
        super();
        System.out.println("no-arg const of antivirus");
    }

    @Override
    public void run() {
        System.out.println("running run in antivirus");
    }

    public void scan() {
        System.out.println("running scan in antivirus");
    }
}
