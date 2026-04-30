package Composite.src.Clase;

public class Sectie implements Structura{
    private String numeSectie;
    private int numarAngajati;

    public Sectie(String numeSectie, int numarAngajati) {
        this.numeSectie = numeSectie;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"nUME SECTIE"+ this.numeSectie+ " numar angajati "+numarAngajati);
    }
}
