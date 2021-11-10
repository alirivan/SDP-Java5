package com.company;

public class AdvancedControl extends BasicControl{

    public AdvancedControl(Device device) {
        super.device = device;
    }

    public void turnOff() {
        System.out.println("Control: turned off");
        device.setApp("Shut down");
    }
}
