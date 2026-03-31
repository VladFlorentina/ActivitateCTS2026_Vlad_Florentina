package cts.simplefactory.factory;

import cts.simplefactory.clase.Supa;
import cts.simplefactory.clase.SupaCiuperci;
import cts.simplefactory.clase.SupaLegume;
import cts.simplefactory.clase.SupaVira;

public class SupaFactory {

    public static Supa creareSupa(TipSupa tip,String nume,String incrediente){
        if(tip==TipSupa.LEGUME){
            return new SupaLegume(nume,incrediente);
        }
        if(tip==TipSupa.VITA){
            return new SupaVira(nume,incrediente);
        }
        if(tip==TipSupa.CIUPERCI){
            return new SupaCiuperci(nume,incrediente);
        }
        throw new IllegalArgumentException("tip supa negasit");
    }
}
