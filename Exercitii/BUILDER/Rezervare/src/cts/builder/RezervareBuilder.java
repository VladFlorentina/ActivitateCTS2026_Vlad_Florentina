package cts.builder;

public class RezervareBuilder implements RezervareAbstractBuilder{

    private String numeClient;
    private boolean asezareGam=false;
    private  boolean scauneErgometrice=false;
    private  boolean masaDecorata=false;
    private  boolean muzicaPersonalizata=false;
    private  String genMuzica;

    public RezervareBuilder() {
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setAsezareGam(boolean asezareGam) {
        this.asezareGam = asezareGam;
        return this;
    }

    public RezervareBuilder setScauneErgometrice(boolean scauneErgometrice) {
        this.scauneErgometrice = scauneErgometrice;
        return this;
    }

    public RezervareBuilder setMasaDecorata(boolean masaDecorata) {
        this.masaDecorata = masaDecorata;
        return this;
    }

    public RezervareBuilder setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(numeClient,asezareGam,scauneErgometrice,masaDecorata,muzicaPersonalizata,genMuzica);
    }
}
