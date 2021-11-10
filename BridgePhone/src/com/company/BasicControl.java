package com.company;

public class BasicControl implements Control{

    protected Device device;

    public BasicControl() {}

    public BasicControl(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Control: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Control: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Control: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void appOpen() {
        System.out.println("Control: app opened");
        device.setApp(device.getApp());
    }

    @Override
    public void appClose() {
        System.out.println("Control: app closed");
        device.setApp(device.getApp());
    }
}
