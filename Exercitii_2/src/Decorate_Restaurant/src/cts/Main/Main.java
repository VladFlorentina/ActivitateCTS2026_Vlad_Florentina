package cts.Main;

import cts.Decorator.NotaDePlata1Mai;
import cts.Decorator.NotaDePlataNoulAn;
import cts.clase.NotaDePlata;
import cts.clase.NotaDePlataAbstract;

public class Main {
    public static void main(String[] args) {

        //1  nota de plata normala
        NotaDePlataAbstract notaSimpla=new NotaDePlata(1160.8f,"31.12.2026");
        notaSimpla.printeaza();
        System.out.println("----------------------");
        //2 aplicam  decoratorul
        NotaDePlataAbstract notaAnNou=new NotaDePlataNoulAn(notaSimpla);
        notaAnNou.printeaza();
        System.out.println("----------------------");
        //3
        NotaDePlataAbstract nota1Mai=new NotaDePlata1Mai(notaSimpla);
        nota1Mai.printeaza();
    }
}
