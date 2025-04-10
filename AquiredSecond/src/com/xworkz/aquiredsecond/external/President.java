package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Leader;

public class President extends Leader {
    public President() {
        super();
        System.out.println("no-arg const of president");
    }

    @Override
    public void guide() {
        System.out.println("running guide in president");
    }

    public void signBills() {
        System.out.println("running signBills in president");
    }
}
