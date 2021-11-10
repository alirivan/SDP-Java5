package com.company;

public class Run {
    public static void main(String[] args) {
        testDevice(new iPhone());
        testDevice(new Meizu());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic control.");
        BasicControl basicRemote = new BasicControl(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced control.");
        AdvancedControl advancedRemote = new AdvancedControl(device);
        advancedRemote.power();
        advancedRemote.turnOff();
        device.printStatus();
    }
}
