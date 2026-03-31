package cts.factory.factory;

import cts.factory.clase.Asistent;
import cts.factory.clase.Brancardier;
import cts.factory.clase.Medic;
import cts.factory.clase.PersonalMedical;

public class PersonalFactory {

    public static PersonalMedical crearePersonal(TipPersoanl tip,String nume){
        if(tip==TipPersoanl.BRACARDIER){
            return new Brancardier(nume);
        }
        if(tip==TipPersoanl.MEDIC){
            return new Medic(nume);
        }
        if(tip==TipPersoanl.ASISTENT){
            return new Asistent(nume);
        }
        throw new IllegalArgumentException("tip personal negasit");
    }
}
