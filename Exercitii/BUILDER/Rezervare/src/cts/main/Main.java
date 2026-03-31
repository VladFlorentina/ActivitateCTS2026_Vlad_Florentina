package cts.main;

import cts.builder.Rezervare;
import cts.builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder=new RezervareBuilder();

        Rezervare r1=builder.setNumeClient("ion").setGenMuzica("trap").build();
        System.out.println("rezervarea 1 "+r1.toString());
    }
}
