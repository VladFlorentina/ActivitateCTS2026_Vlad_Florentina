package clase.adapter;

import clase.farmacie.Medicament;

public class Adaptor extends Medicament {
    private clase.spital.Medicament medSpital;

    public Adaptor(clase.spital.Medicament medSpital){
        super(medSpital.getNume());
        this.medSpital=medSpital;
    }

    @Override
    public void cumparaMedicament() {
       medSpital.achizitioneazaMedicament();
    }
}
