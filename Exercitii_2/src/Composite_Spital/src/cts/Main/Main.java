package cts.Main;

import cts.clas.Departament;
import cts.clas.Sectie;
import cts.clas.Structura;

public class Main {
    public static void main(String[] args) {
        Departament depSpital=new Departament("Spital general");
        Departament depManagement=new Departament("departament manangement");
        Departament depMedical=new Departament("departament medical");

        Structura sectieSecretariat=new Sectie("Secretariat",20);
        Structura sectieManagement = new Sectie("Management", 5);
        Structura sectieCardiologie = new Sectie("Cardiologie", 45);

        depManagement.adaugaStructura(sectieSecretariat);
        depManagement.adaugaStructura(sectieManagement);

        depMedical.adaugaStructura(sectieCardiologie);

        depSpital.adaugaStructura(depManagement);
        depSpital.adaugaStructura(depMedical);

        depSpital.afisieazaDetaliiStructura("");

        depManagement.sterheStructura(sectieManagement);
        depSpital.afisieazaDetaliiStructura("");
    }
}
