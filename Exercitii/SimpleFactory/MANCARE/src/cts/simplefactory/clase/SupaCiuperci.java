package cts.simplefactory.clase;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(String nume, String incrediente) {
        super(nume, incrediente);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("supa de ciuperci");
    }
}
