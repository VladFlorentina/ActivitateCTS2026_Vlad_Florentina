package cts.clase.Terestru;

public class BiletTerestru {

    private String denumireBilet;

    public BiletTerestru(String denumireBilet) {
        this.denumireBilet = denumireBilet;
    }

    public void valideazaBilet(){
        System.out.println("biletul "+this.denumireBilet+" este terestu");
    }

    public String getDenumireBilet() {
        return denumireBilet;
    }
}
