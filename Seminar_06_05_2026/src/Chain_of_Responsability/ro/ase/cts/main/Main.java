package Chain_of_Responsability.ro.ase.cts.main;

import Chain_of_Responsability.ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();

        calatorieTroleibuz.setHandler(calatorieAutobuz);
        calatorieAutobuz.setHandler(calatorieTramvai);
        calatorieTramvai.setHandler(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(10));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(7));
    }
}
