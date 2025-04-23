package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Hospital;

public class ApolloHospital implements Hospital {
    @Override
    public void clean() {
        System.out.println("Running clean in ApolloHospital");
    }
}
