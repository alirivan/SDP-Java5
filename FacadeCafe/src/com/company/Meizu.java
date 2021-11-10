package com.company;

public class Meizu implements MobileStore {
    @Override
    public void model() {
        System.out.println("Meizu 16 Pro");
    }

    @Override
    public void characteristics() {
        System.out.println("Unknown");
    }

    @Override
    public void price() {
        System.out.println("Unknown");
    }
}
