package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Weather;

public class RainyWeather extends Weather {
    public RainyWeather() {
        super();
        System.out.println("no-arg const of rainyWeather");
    }

    @Override
    public void change() {
        System.out.println("running change in rainyWeather");
    }

    public void pourRain() {
        System.out.println("running pourRain in rainyWeather");
    }
}
