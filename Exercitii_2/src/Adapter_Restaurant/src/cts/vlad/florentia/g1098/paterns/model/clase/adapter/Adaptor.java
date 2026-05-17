package cts.vlad.florentia.g1098.paterns.model.clase.adapter;

import cts.vlad.florentia.g1098.paterns.model.clase.bar.SoftBar;
import cts.vlad.florentia.g1098.paterns.model.clase.restaurant.FacturaBucatarie;

public class Adaptor extends FacturaBucatarie {
    private SoftBar softBar;


    public Adaptor(SoftBar softBar) {
        super(softBar.getNumeBautura(),0.0);
        this.softBar=softBar;
    }

    @Override
    public void printeazaFactura() {
        softBar.genereazaNotaBar();
    }
}
