package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi=new ArrayList<>();
    }

    public void adaugaComenzi(Command c){
        comenzi.add(c);
    }

    public void executaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
