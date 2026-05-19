package cts.clase;

public class Meniu implements Structura{
    private String numeProdus;
    private float pret;

    public Meniu(String numeProdus, float pret) {
        this.numeProdus = numeProdus;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+" nume preparat "+this.numeProdus+" pret "+this.pret);
    }
}
