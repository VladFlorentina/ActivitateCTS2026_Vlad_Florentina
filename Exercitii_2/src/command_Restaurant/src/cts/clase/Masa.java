package cts.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public  void rezervaMasa(){
        System.out.println("masa "+this.nrMasa+" a fost rezervata");

    }
    public void ocupaMasa(){
        System.out.println("masa "+this.nrMasa+" a fost Ocupata");
    }
}
