package cts.clase.Metrou;

public class BiletMetrou {
    private String denumireBilet;

    public BiletMetrou(String denumireBilet) {
        this.denumireBilet = denumireBilet;
    }

    public void validareMetrou(){
        System.out.println("biletul de metrou "+this.denumireBilet+" validat");
    }

    public String getDenumireBilet() {
        return denumireBilet;
    }
}
