package Composite.src.main;

import Composite.src.Clase.Departament;
import Composite.src.Clase.Sectie;
import Composite.src.Clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura depSecretariat = new Sectie("Secretariat", 20);
        Structura depManagement = new Sectie("Management", 30);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(depManagement);
        ((Departament) depAdministrativ).adaugaStructura(depSecretariat);

        depSpital.afiseazaDetaliiStructura(" ");

        ((Departament) depSpital).stergeStructura(depManagement);
        ((Departament) depAdministrativ).stergeStructura(depManagement);


    }
}
