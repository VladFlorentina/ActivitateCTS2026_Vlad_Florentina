package cts.factory.clase;

public abstract class PersonalMedical {

    private String nume ;

    public PersonalMedical(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaDetalii();
}
