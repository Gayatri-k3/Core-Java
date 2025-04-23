package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.*;
import com.xworkz.interfaces.internal.*;


public class runner {
    public static void main(String[] args) {
        Hospital hospital = new ApolloHospital();
        ApolloHospital apolloHospital = new ApolloHospital();
        hospital.clean();
        apolloHospital.clean();
        Fan fan = new CeilingFan();
        CeilingFan ceilingFan = new CeilingFan();
        fan.rotate();
        ceilingFan.rotate();

        Light light = new TubeLight();
        TubeLight tubeLight = new TubeLight();
        light.glow();
        tubeLight.glow();

        Book book = new Novel();
        Novel novel = new Novel();
        book.read();
        novel.read();

        Door door = new MainDoor();
        MainDoor mainDoor = new MainDoor();
        door.open();
        mainDoor.open();

        Pen pen = new BallPen();
        BallPen ballPen = new BallPen();
        pen.write();
        ballPen.write();

        Printer printer = new HPPrinter();
        HPPrinter hpPrinter = new HPPrinter();
        printer.print();
        printer.scan();
        printer.copy();
        hpPrinter.print();
        hpPrinter.scan();
        hpPrinter.copy();

        Vehicle vehicle = new Car();
        Car car = new Car();
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        car.start();
        car.accelerate();
        car.stop();

        Mobile mobile = new SmartPhone();
        SmartPhone smartPhone = new SmartPhone();
        mobile.call();
        mobile.message();
        mobile.browse();
        smartPhone.call();
        smartPhone.message();
        smartPhone.browse();

        TV tv = new LEDTV();
        LEDTV ledtv = new LEDTV();
        tv.switchOn();
        tv.changeChannel();
        tv.adjustVolume();
        ledtv.switchOn();
        ledtv.changeChannel();
        ledtv.adjustVolume();

        Camera camera = new DSLR();
        DSLR dslr = new DSLR();
        camera.capture();
        camera.record();
        camera.zoom();
        dslr.capture();
        dslr.record();
        dslr.zoom();
    }
}