package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Tree;

public class MangoTree extends Tree {
    public MangoTree() {
        super();
        System.out.println("no-arg const of mango tree");
    }

    @Override
    public void grow() {
        System.out.println("running grow in mango tree");
    }

    public void produceMangoes() {
        System.out.println("running produceMangoes in mango tree");
    }
}
