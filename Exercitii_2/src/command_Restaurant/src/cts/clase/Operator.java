package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi;
    public Operator(){
        this.listaComenzi=new ArrayList<>();
    }

    public void adaugaComanda(Command c){
        this.listaComenzi.add(c);
    }

    public void executaComanda(){
        if(this.listaComenzi.size()>0){
            Command comandaDeEx=this.listaComenzi.get(0);
            comandaDeEx.executa();
            this.listaComenzi.remove(0);
        }else{
            System.out.println("Nu exista nicio comanda in asteptare in modulul operatorului.");
        }
    }
}
