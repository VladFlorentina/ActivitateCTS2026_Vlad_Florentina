package Decorator.src.main;

import Decorator.src.Clase.Decorator.NotaDePlata1Mai;
import Decorator.src.Clase.Decorator.NotaDePlataDecorator;
import Decorator.src.Clase.Decorator.NotaDePlataNoulAn;
import Decorator.src.Clase.NotaDePlata;
import Decorator.src.Clase.NotaDePlataAbstract;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(13, "13.04.2026");
        notaDePlata.printeaza();

        int a=2;
        NotaDePlataDecorator notaDePlataDecorator;
        if(a == 1){
            notaDePlataDecorator = new NotaDePlataNoulAn(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
