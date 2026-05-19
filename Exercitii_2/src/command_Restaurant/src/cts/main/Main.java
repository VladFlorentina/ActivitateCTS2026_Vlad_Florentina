package cts.main;

import cts.clase.*;

public class Main {
    public static void main(String[] args) {
        // Cream modulul central condus de operator
        Operator operator = new Operator();

        // Cream mesele fizice din restaurant
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);
        Masa masa3 = new Masa(3);

        // Pasul 1: Se primesc solicitari. Operatorul creeaza obiectele-comenzi
        Command rezervareMasa1 = new ComandaRezervare(masa1);
        Command ocupareMasa2 = new ComandaOcupare(masa2);
        Command rezervareMasa3 = new ComandaRezervare(masa3);

        // Pasul 2: Comenzile sunt salvate in colectia din Operator
        operator.adaugaComanda(rezervareMasa1);
        operator.adaugaComanda(ocupareMasa2);
        operator.adaugaComanda(rezervareMasa3);

        System.out.println("--- Toate comenzile au fost preluate si stocate de Operator ---");
        System.out.println("--- Incepe trimiterea si executarea efectiva a comenzilor catre mese ---\n");

        // Pasul 3: Se executa comenzile in ordinea in care au fost adaugate
        operator.executaComanda(); // Rezerva masa 1
        operator.executaComanda(); // Ocupa masa 2
        operator.executaComanda(); // Rezerva masa 3

        // Incercam sa mai executam o comanda pentru a verifica siguranta listei goale
        operator.executaComanda();
    }

}
