package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Friend;

public class BestFriend extends Friend {
    public BestFriend() {
        super();
        System.out.println("no-arg const of bestFriend");
    }

    @Override
    public void hangOut() {
        System.out.println("running hangOut in bestFriend");
    }

    public void shareSecrets() {
        System.out.println("running shareSecrets in bestFriend");
    }
}
