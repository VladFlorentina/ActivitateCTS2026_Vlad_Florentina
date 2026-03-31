package cts.factory.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("medicul "+getNume());
    }
}
