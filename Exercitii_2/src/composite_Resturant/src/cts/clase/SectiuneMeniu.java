package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements Structura{
    private String numeSectiune;
    private List<Structura> subElemente;

    public SectiuneMeniu(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        this.subElemente=new ArrayList<>();
    }
    public  void adaugaElement(Structura s){
        subElemente.add(s);
    }
    public  void stergeElement(Structura s){
        subElemente.remove(s);
    }

    public Structura getStructura(int pozitie){
        return subElemente.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+" nume sectiune "+this.numeSectiune);
        for (Structura s: subElemente){
            s.afiseazaDetalii(spatii+" ");
        }
    }
}
