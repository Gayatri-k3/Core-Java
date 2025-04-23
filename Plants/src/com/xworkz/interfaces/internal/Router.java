package com.xworkz.interfaces.internal;

public interface Router {
    void connect();
    void disconnect();
    void reset();
    void configure();
    void blockDevice();
    void monitorTraffic();
    void updateFirmware();
}