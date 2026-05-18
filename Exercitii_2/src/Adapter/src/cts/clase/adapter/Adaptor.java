package cts.clase.adapter;

import cts.clase.farmacie.Medicament;

public class Adaptor extends Medicament {
    private cts.clase.spital.Medicament medSpital;

    public Adaptor(cts.clase.spital.Medicament medSpital){
        super(medSpital.getNume());
        this.medSpital=medSpital;
    }

    @Override
    public void cumparaMedicament() {
       medSpital.achizitioneazaMedicament();
    }
}
