package cts.main;

import cts.factory.clase.PersonalMedical;
import cts.factory.factory.PersonalFactory;
import cts.factory.factory.TipPersoanl;

public class Main {

    public static void main(String[] args) {
        PersonalFactory factory=new PersonalFactory();

        PersonalMedical p1=factory.crearePersonal(TipPersoanl.ASISTENT,"ALIN");
        p1.afiseazaDetalii();
    }
}
