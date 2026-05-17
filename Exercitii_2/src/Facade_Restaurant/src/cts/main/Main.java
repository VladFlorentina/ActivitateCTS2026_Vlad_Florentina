package cts.main;

import cts.clase.*;

public class Main {
    public static void main(String[] args) {

        Sala s=new Sala();
        Debarasare d=new Debarasare();
        AranjareMasa am=new AranjareMasa();

        ReceptieFacade rF=new ReceptieFacade(am,s,d);

        Client c1=new Client("ion");
        Client c2=new Client("popa");
        Client c3=new Client("vlad");

        rF.alocaMasaClient(c1);
        rF.alocaMasaClient(c2);
    }
}
