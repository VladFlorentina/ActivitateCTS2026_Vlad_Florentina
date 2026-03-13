package main;

import Clase.MijlocTransport;
import Factory.Depou;
import Factory.Tipuri;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ, 4, "OT02VIA");
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI, 10, "OT03VIA");
        MijlocTransport troleibuz = depou.getMijlocTransport(Tipuri.TROLEIBUZ, 4, "OT04VIA");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        //de facut singleton la asta
    }
}
