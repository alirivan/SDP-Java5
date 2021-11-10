package com.company;

public class ChargerAdapter implements AnotherCharger{

    Charger charger;
    public ChargerAdapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void adapterCh() {
        charger.outlet();
    }
}
