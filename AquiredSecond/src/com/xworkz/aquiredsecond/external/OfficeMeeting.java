package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Meeting;

public class OfficeMeeting extends Meeting {
    public OfficeMeeting() {
        super();
        System.out.println("no-arg const of officeMeeting");
    }

    @Override
    public void schedule() {
        System.out.println("running schedule in officeMeeting");
    }

    public void discussAgenda() {
        System.out.println("running discussAgenda in officeMeeting");
    }
}
