package cts.clase;

public class Autobuz implements Structura{
    private String producator;
    private String model;
    private int nrlocuri;

    public Autobuz(String producator, String model, int nrlocuri) {
        this.producator = producator;
        this.model = model;
        this.nrlocuri = nrlocuri;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+"autobuzul "+this.model+" "+this.producator+" locuri"+this.nrlocuri);
    }
}
