package cts.main;

import cts.clase.Medic;
import cts.clase.Pacient;
import cts.clase.ReceptieSpitalFacade;
import cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        //creem o singura data obiectele de baza
        Medic m=new Medic();
        Salon s=new Salon();
        //facada si punem disp med si sal
        ReceptieSpitalFacade receptie=new ReceptieSpitalFacade(m,s);

        //pacienti
        Pacient p1=new Pacient("George",2);
        Pacient p2=new Pacient("Ana",8);
        Pacient p3=new Pacient("Razvan",6);

        //folosim facada
        receptie.interneazaPacient(p1);
        receptie.interneazaPacient(p2);
        receptie.interneazaPacient(p3);

    }
}
