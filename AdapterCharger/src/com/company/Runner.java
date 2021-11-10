package com.company;

public class Runner {
    public static void main(String[] args) {
        EuropeanStandard europeanStandard = new EuropeanStandard();
        AnotherCharger anotherCharger = new ChineseStandard();

        AnotherCharger chargerAdapter = new ChargerAdapter(europeanStandard);

        System.out.println("Europe...");
        europeanStandard.adapter();
        europeanStandard.outlet();
        System.out.println(" ");
        System.out.println("China...");
        anotherCharger.adapterCh();
        System.out.println(" ");
        System.out.println("Charger Adapter");
        chargerAdapter.adapterCh();
    }
}
