package com.company;

public class EuropeanStandard implements Charger{
    @Override
    public void adapter() {
        System.out.println("I have European Standard Adapter");
    }

    @Override
    public void outlet() {
        System.out.println("You can plug me into European Standard Outlets");
    }
}
