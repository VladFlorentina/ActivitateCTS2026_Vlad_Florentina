package cts.clas;

public class Sectie implements Structura{
    private String numeSectie;
    private int  nrAng;

    public Sectie(String numeSectie, int nrAng) {
        this.numeSectie = numeSectie;
        this.nrAng = nrAng;
    }


    @Override
    public void afisieazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"nume sectie"+this.numeSectie+" nr angajati"+this.nrAng);
    }
}
