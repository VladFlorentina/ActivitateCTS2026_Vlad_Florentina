package cts.main;

import cts.simplefactory.clase.Supa;
import cts.simplefactory.factory.SupaFactory;
import cts.simplefactory.factory.TipSupa;

public class Main {
    public static void main(String[] args) {

        SupaFactory factory=new SupaFactory();

        Supa s1= factory.creareSupa(TipSupa.CIUPERCI,"supa ciuperci xxl","ciuperci,lapte");
        s1.afiseazaDetalii();
    }
}
