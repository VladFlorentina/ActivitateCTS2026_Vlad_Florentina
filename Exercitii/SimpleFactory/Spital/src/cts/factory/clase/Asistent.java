package cts.factory.clase;

public class Asistent extends  PersonalMedical{


    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("asistentul "+getNume());
    }
}
