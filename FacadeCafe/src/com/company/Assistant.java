package com.company;

public class Assistant {

    private MobileStore iPhone;
    private MobileStore Samsung;
    private MobileStore Meizu;

    public Assistant() {
        iPhone = new iPhone();
        Samsung = new Samsung();
        Meizu = new Meizu();
    }

    public void iPhoneSale() {
        iPhone.model();
        iPhone.characteristics();
        iPhone.price();
    }

    public void SamsungSale() {
        Samsung.model();
        Samsung.characteristics();
        Samsung.price();
    }

    public void MeizuSale() {
        Meizu.model();
        Meizu.characteristics();
        Meizu.price();
    }
}
