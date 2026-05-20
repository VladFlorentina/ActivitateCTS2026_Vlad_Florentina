package cts.clase;

public class Statie {
    public String numeStatie;
    public int nrCalatori;

    public Statie(String numeStatie, int nrCalatori) {
        this.numeStatie = numeStatie;
        this.nrCalatori = nrCalatori;
    }

    public String getNumeStatie() {
        return numeStatie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }
}
