package main;

import cts.clase.adapter.Adaptor;
import cts.clase.farmacie.Medicament;

public class Main {

    public static void procuraMedicament(Medicament medFarmacie)
    {medFarmacie.cumparaMedicament();}

    public static void main(String[] args) {
        cts.clase.spital.Medicament medSpital=new cts.clase.spital.Medicament("nurofen",24.6f);
        Medicament medFar=new Medicament("medTest");

        procuraMedicament(medFar);
        Adaptor adaptorDinSpital=new Adaptor(medSpital);
        procuraMedicament(adaptorDinSpital);

    }
}
