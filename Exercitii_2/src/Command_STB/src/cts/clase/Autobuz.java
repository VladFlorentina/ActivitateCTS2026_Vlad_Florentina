package cts.clase;

public class Autobuz {
    private String producator;

    public Autobuz(String producator){
        this.producator=producator;
    }

    public void pleacaPeTraseu(int nrLinie){
        System.out.println("autobuzul "+this.producator+" porneste de pe linia "+nrLinie);
    }
}
