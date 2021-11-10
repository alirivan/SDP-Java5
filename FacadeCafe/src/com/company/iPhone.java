package com.company;

import java.util.ArrayList;

public class iPhone implements MobileStore {

    @Override
    public void model() {
        System.out.println("iPhone 11");
    }

    @Override
    public void characteristics() {
        System.out.println("Processor: A13 Bionic");
        System.out.println("Camera: Dual camera");
        System.out.println("Security: Face ID");
    }

    @Override
    public void price() {
        System.out.println("340,000 T");
    }
}
