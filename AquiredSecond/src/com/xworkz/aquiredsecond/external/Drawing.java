package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Activity;

public class Drawing extends Activity {
    public Drawing() {
        super();
        System.out.println("no-arg const of drawing");
    }

    @Override
    public void perform() {
        System.out.println("running perform in drawing");
    }

    public void usePencil() {
        System.out.println("running usePencil in drawing");
    }
}
