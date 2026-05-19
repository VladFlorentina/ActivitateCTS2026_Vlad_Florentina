package cts.main;

import cts.clase.Meniu;
import cts.clase.SectiuneMeniu;
import cts.clase.Structura;

public class main {
    public static void main(String[] args) {
        SectiuneMeniu meniuComplet=new SectiuneMeniu(" meniu complet");
        SectiuneMeniu sectiuneStartere=new SectiuneMeniu("startare");
        SectiuneMeniu sectiuneBauturi=new SectiuneMeniu("bauturi");
        SectiuneMeniu sectiuneDesert=new SectiuneMeniu("desert");

        SectiuneMeniu subSucuri=new SectiuneMeniu("sucuri");
        SectiuneMeniu subCafea=new SectiuneMeniu("cafea");

        Structura bruschete=new Meniu("bruschete rosii",15.5f);
        Structura focacia=new Meniu("focacia",26.3f);

        Structura apaPlata=new Meniu("apa plata",10.0f);
        Structura apaMin=new Meniu("apa minerala",10.0f);
        Structura cola = new Meniu("Coca Cola", 11.0f);
        Structura fanta = new Meniu("Fanta", 11.0f);
        Structura espresso = new Meniu("Espresso Scurt", 10.0f);
        Structura cappuccino = new Meniu("Cappuccino", 15.0f);
        Structura clatite = new Meniu("clatite", 20.0f);
        Structura papanasi = new Meniu("papanasi", 35.0f);

        //asamblare meniu
        // Adaugam categoriile principale in radacina meniului
        meniuComplet.adaugaElement(sectiuneStartere);
        meniuComplet.adaugaElement(sectiuneBauturi);
        meniuComplet.adaugaElement(sectiuneDesert);

        // Adaugam preparatele in sectiunea Startere
        sectiuneStartere.adaugaElement(bruschete);
        sectiuneStartere.adaugaElement(focacia);

        //adaugam bauturile
        sectiuneBauturi.adaugaElement(apaMin);
        sectiuneBauturi.adaugaElement(apaPlata);
        sectiuneBauturi.adaugaElement(subCafea);
        sectiuneBauturi.adaugaElement(subSucuri);

        subCafea.adaugaElement(cappuccino);
        subCafea.adaugaElement(espresso);

        subSucuri.adaugaElement(cola);
        subSucuri.adaugaElement(fanta);

        sectiuneDesert.adaugaElement(papanasi);
        sectiuneDesert.adaugaElement(clatite);

        meniuComplet.afiseazaDetalii(" ");
        // 7. TESTARE MODIFICARE DINAMICA (Stergerea unui element direct)
        System.out.println("\n--- MODIFICARE MENIU (Se elimina bautura Fanta) ---");
        subCafea.stergeElement(espresso);
        meniuComplet.afiseazaDetalii(" ");
    }
}
