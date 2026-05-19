package cts.main;

import cts.clase.Autobuz;
import cts.clase.Command;
import cts.clase.Operator;
import cts.clase.Plecare;

public class main {

    public static void main(String[] args) {
        //creem panoul de control
        Operator op=new Operator();

        // Pasul 1: Dimineata, operatorul defineste plecarile (creeaza comenzile impachetate)
        Command c1=new Plecare(new Autobuz("a"),1);
        Command c2=new Plecare(new Autobuz("b"),2);
        // Pasul 2: Salveaza toate aceste comenzi in colectia operatorului
        op.adaugaComanda(c1);
        op.adaugaComanda(c2);
        op.adaugaComanda(new Plecare(new Autobuz("c"),3));
        System.out.println("--- Toate comenzile au fost salvate de catre operator la prima ora ---");
        System.out.println("--- Incepe preluarea automata a curselor pe parcursul zilei ---\n");

        // Pasul 3: Pe parcursul zilei, cand autobuzele devin disponibile, comenzile se executa
        op.executaComanda();
        op.executaComanda();
        op.executaComanda();
    }

}
