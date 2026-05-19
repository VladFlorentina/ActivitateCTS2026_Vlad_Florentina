package cts.clase.Adaptor;

import cts.clase.Metrou.BiletMetrou;
import cts.clase.Terestru.BiletTerestru;

public class Adapter extends BiletMetrou {
    private cts.clase.Terestru.BiletTerestru bt;

    public Adapter( BiletTerestru bt) {
        super(bt.getDenumireBilet());
        this.bt = bt;
    }


    @Override
    public void validareMetrou() {
        this.bt.valideazaBilet();
    }
}
