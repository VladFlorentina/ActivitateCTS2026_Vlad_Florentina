package cts.main;

import cts.clase.Autobuz;
import cts.clase.GrupaAutobuze;
import cts.clase.Structura;

public class main {
    public static void main(String[] args) {

        GrupaAutobuze flotaPrincipala=new GrupaAutobuze(" flota generala");
        GrupaAutobuze grupMici=new GrupaAutobuze("grup mic 10 locuri");
        GrupaAutobuze grupMedii=new GrupaAutobuze("grup mediu 30 locuri");
        GrupaAutobuze grupMari=new GrupaAutobuze("grup mare 50 locuri");

        Structura autobuzA=new Autobuz("producator1","model1",10);
        Structura microbuzMercedes = new Autobuz("Mercedes", "Sprinter", 10);
        Structura microbuzFord = new Autobuz("Ford", "Transit", 12);

        Structura autobuzIsuzu = new Autobuz("Isuzu", "Citiport", 30);
        Structura autobuzOtokarMediu = new Autobuz("Otokar", "Kent C 10m", 32);

        Structura autobuzMercedesMare = new Autobuz("Mercedes", "Citaro", 50);


        flotaPrincipala.adaugaStructura(grupMici);
        flotaPrincipala.adaugaStructura(grupMedii);
        flotaPrincipala.adaugaStructura(grupMari);
        grupMici.adaugaStructura(autobuzA);
        grupMici.adaugaStructura(microbuzMercedes);
        grupMici.adaugaStructura(microbuzFord);
        grupMedii.adaugaStructura(autobuzIsuzu);
        grupMedii.adaugaStructura(autobuzOtokarMediu);
        grupMari.adaugaStructura(autobuzMercedesMare);

        flotaPrincipala.afiseazaDetalii(" ");

        System.out.println("\n--- STERGERE ELEMENT DIRECTA ---");
        grupMici.stergeStructura(autobuzA);
        grupMici.afiseazaDetalii(" ");
    }
}
