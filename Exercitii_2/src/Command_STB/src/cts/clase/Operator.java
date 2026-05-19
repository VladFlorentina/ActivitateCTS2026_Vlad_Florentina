package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void  adaugaComanda(Command c){
        comenzi.add(c);
    }

    public  void executaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).pleacaInCursa();
            comenzi.remove(0);
        }else{
            System.out.println("nu mai exista comenzi in lista");
        }
    }
}
