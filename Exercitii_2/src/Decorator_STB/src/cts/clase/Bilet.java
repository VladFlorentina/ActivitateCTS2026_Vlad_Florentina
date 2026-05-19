package cts.clase;

public class Bilet implements BiletAbstract{
    private String tipBilet;
    private int suma;

    public Bilet(String tipBilet, int suma) {
        this.tipBilet = tipBilet;
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println(" biletul "+this.tipBilet+" a fost cumparat : "+this.suma);
    }
}
