package cts.Main;

import cts.prototype.Rezervare;
import cts.prototype.RezervareRegistru;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> preferinte=new ArrayList<>();
        preferinte.add("cafea fara lapte,masa la geam ,muzica orientala");

        Rezervare r1=new Rezervare("Popa ion",preferinte);
        RezervareRegistru registru=new RezervareRegistru();
        registru.adaugaPreset("rezervare1",r1);
        Rezervare r2=(Rezervare) registru.getRegistru("rezervare1");

        System.out.println("rezervarea 1 "+r1.toString());
        System.out.println("rezervarea 2 "+r2.toString());
    }
}
