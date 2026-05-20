package cts.clase;

public class Pacient {
    private String nume;
    private boolean areTrimitere;

    public Pacient(String nume, boolean areTrimitere) {
        this.nume = nume;
        this.areTrimitere = areTrimitere;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreTrimitere() {
        return areTrimitere;
    }
}
