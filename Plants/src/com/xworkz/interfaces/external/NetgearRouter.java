package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Router;

public class NetgearRouter implements Router {
    public void connect() { System.out.println("Connecting to network"); }
    public void disconnect() { System.out.println("Disconnecting from network"); }
    public void reset() { System.out.println("Resetting router"); }
    public void configure() { System.out.println("Configuring router"); }
    public void blockDevice() { System.out.println("Blocking device"); }
    public void monitorTraffic() { System.out.println("Monitoring traffic"); }
    public void updateFirmware() { System.out.println("Updating firmware"); }
}