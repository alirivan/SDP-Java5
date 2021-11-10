package com.company;

public class Samsung implements MobileStore {
    @Override
    public void model() {
        System.out.println("Samsung Galaxy S21 Ultra");
    }

    @Override
    public void characteristics() {
        System.out.println("Processor: Qualcom Snapdragon 888");
        System.out.println("Camera: 5-lens camera");
        System.out.println("Security: Fingerprint | 'Face ID' ");
    }

    @Override
    public void price() {
        System.out.println("340,000 T");
    }
}
