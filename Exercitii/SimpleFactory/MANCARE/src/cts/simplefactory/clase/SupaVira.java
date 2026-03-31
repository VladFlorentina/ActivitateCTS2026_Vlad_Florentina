package cts.simplefactory.clase;

public class SupaVira extends Supa{
    public SupaVira(String nume, String incrediente) {
        super(nume, incrediente);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("supa vita");
    }
}
