package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Store;

public class GroceryStore extends Store {
    public GroceryStore() {
        super();
        System.out.println("no-arg const of groceryStore");
    }

    @Override
    public void sellItems() {
        System.out.println("running sellItems in groceryStore");
    }

    public void stockFood() {
        System.out.println("running stockFood in groceryStore");
    }
}
