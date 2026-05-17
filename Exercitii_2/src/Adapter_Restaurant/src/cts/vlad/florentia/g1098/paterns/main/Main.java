package cts.vlad.florentia.g1098.paterns.main;

import cts.vlad.florentia.g1098.paterns.model.clase.adapter.Adaptor;
import cts.vlad.florentia.g1098.paterns.model.clase.bar.SoftBar;
import cts.vlad.florentia.g1098.paterns.model.clase.restaurant.FacturaBucatarie;

public class Main {
    public static void proceseazaPrintare(FacturaBucatarie factura){
        factura.printeazaFactura();
    }

    public static void main(String[] args) {
        //creez un obiect folosind softul vechi de la bucatarie
        FacturaBucatarie produsBuc=new FacturaBucatarie("pizza",55.0);
        proceseazaPrintare(produsBuc);

        //testam noul soft
        SoftBar produsBar=new SoftBar("limonada");
        // Daca ai incerca sa scrii:
        // proceseazaPrintare(produsBar); -> ar da eroare de compilare!
        Adaptor adaptor=new Adaptor(produsBar);
        proceseazaPrintare(adaptor);
    }
}
