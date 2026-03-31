package cts.builder;

public class Rezervare {

    protected String numeClient;
    protected boolean asezareGam;
    protected  boolean scauneErgometrice;
    protected  boolean masaDecorate;
    protected  boolean muzicaPersonalizata;
    protected  String genMuzica;

    protected Rezervare(String numeClient, boolean asezareGam, boolean scauneErgometrice, boolean masaDecorate, boolean muzicaPersonalizata, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareGam = asezareGam;
        this.scauneErgometrice = scauneErgometrice;
        this.masaDecorate = masaDecorate;
        this.muzicaPersonalizata = muzicaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isAsezareGam() {
        return asezareGam;
    }

    public void setAsezareGam(boolean asezareGam) {
        this.asezareGam = asezareGam;
    }

    public boolean isScauneErgometrice() {
        return scauneErgometrice;
    }

    public void setScauneErgometrice(boolean scauneErgometrice) {
        this.scauneErgometrice = scauneErgometrice;
    }

    public boolean isMasaDecorate() {
        return masaDecorate;
    }

    public void setMasaDecorate(boolean masaDecorate) {
        this.masaDecorate = masaDecorate;
    }

    public boolean isMuzicaPersonalizata() {
        return muzicaPersonalizata;
    }

    public void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareGam=").append(asezareGam);
        sb.append(", scauneErgometrice=").append(scauneErgometrice);
        sb.append(", masaDecorate=").append(masaDecorate);
        sb.append(", muzicaPersonalizata=").append(muzicaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
