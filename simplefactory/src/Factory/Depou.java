package Factory;

import Clase.Autobuz;
import Clase.MijlocTransport;
import Clase.Tramvai;
import Clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare) {
        if(tip == Tipuri.AUTOBUZ) {
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        if(tip == Tipuri.TRAMVAI) {
            return new Tramvai(numarRoti, numarInmatriculare);
        }
        if(tip == Tipuri.TROLEIBUZ) {
            return new Troleibuz(numarRoti, numarInmatriculare);
        }
        return null;
    }
}
