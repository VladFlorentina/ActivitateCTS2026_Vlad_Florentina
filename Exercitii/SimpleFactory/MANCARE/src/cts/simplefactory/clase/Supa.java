package cts.simplefactory.clase;

public abstract class Supa {
    private String nume;
    private String incrediente;

    public Supa(String nume, String incrediente) {
        this.nume = nume;
        this.incrediente = incrediente;
    }


    public String getNume() {
        return nume;
    }

    public String getIncrediente() {
        return incrediente;
    }

    public abstract void afiseazaDetalii();
}
