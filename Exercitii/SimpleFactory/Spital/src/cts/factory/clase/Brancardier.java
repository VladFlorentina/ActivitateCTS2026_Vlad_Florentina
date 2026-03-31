package cts.factory.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("bracardierul "+getNume());
    }
}
