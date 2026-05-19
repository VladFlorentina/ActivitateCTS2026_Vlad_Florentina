package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupaAutobuze implements Structura{

    private String denumireGrup;
    private List<Structura> elementeFlota;

    public GrupaAutobuze(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.elementeFlota = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        elementeFlota.add(structura);
    }
    public void stergeStructura(Structura structura){
        elementeFlota.remove(structura);
    }

    public Structura getStructura(int pozitie){
        return  elementeFlota.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+" denumire grup "+this.denumireGrup);
        for(Structura structura : elementeFlota){
            structura.afiseazaDetalii(spatii+" ");
        }
    }
}
