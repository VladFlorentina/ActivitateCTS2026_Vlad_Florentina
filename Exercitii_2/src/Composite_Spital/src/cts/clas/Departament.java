package cts.clas;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{

    private String numeDepartament;
    private List<Structura> subStructuri;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.subStructuri = new ArrayList<>();
    }
    public void adaugaStructura(Structura s){
        subStructuri.add(s);
    }

    public void sterheStructura(Structura s){
         subStructuri.remove(s);
    }

    public Structura getStructura(int poz){
        return subStructuri.get(poz);
    }

    @Override
    public void afisieazaDetaliiStructura(String spatii) {
        System.out.println(spatii+" nume departament : "+this.numeDepartament);
        for (Structura structura:subStructuri){
            structura.afisieazaDetaliiStructura(spatii+"  ");
        }
    }
}
