package cts.main;

import cts.clase.Pacient;
import cts.clase.PlataCard;
import cts.clase.PlataCash;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1=new Pacient();
        pacient1.setSumaPlata(200.0);
        pacient1.platesteSpitalizarea();

        System.out.println("\n--- Testare Constructor 2 (Doar date, fara strategie la inceput) ---");
        // Cazul standard: stim datele pacientului, dar el inca nu s-a decis cum plateste
        Pacient pacientStandard = new Pacient("Mihai Ionescu", 750.0);

        // Daca incercam sa platim acum, ne va spune ca nu am ales o metoda de plata
        pacientStandard.platesteSpitalizarea();

        // Pacientul scoate cardul la receptie (folosim Setter-ul)
        pacientStandard.setModPlata(new PlataCard());
        pacientStandard.platesteSpitalizarea();


        System.out.println("\n--- Testare Constructor 3 (Doar strategia injectata la nastere) ---");
        // Cream un obiect axat direct pe o simulare rapida a platilor cu cardul
        Pacient pacientSimulare = new Pacient(new PlataCard());
        pacientSimulare.setSumaPlata(1200.0);
        // Va functiona direct ca plata cu cardul pentru un pacient anonim
        pacientSimulare.platesteSpitalizarea();


        System.out.println("\n--- Demonstratie schimari dinamice succesive (Inima pattern-ului Strategy) ---");
        // Luam pacientul standard de mai devreme (Mihai) si ii schimbam metoda din mers in Cash
        pacientStandard.setModPlata(new PlataCash());
        pacientStandard.platesteSpitalizarea();
    }
}
