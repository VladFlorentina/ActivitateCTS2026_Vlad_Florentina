package cts.simplefactory.clase;

public class SupaLegume extends Supa{
    public SupaLegume(String nume, String incrediente) {
        super(nume, incrediente);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("supa legume");
    }
}
