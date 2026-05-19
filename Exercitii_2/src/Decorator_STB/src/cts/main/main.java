package cts.main;


import cts.clase.Bilet;
import cts.clase.BiletAbstract;
import cts.clase.Decorator.Bilet1Mai;
import cts.clase.Decorator.BiletCraciun;
import cts.clase.Decorator.BiletDecorator;

public class main {
    public static void main(String[] args) {
        BiletAbstract bilet1=new Bilet("bilet metrou",5);
        bilet1.printeaza();

        BiletDecorator bilet1Mai=new Bilet1Mai(bilet1);
        bilet1Mai.felicitare();

        BiletDecorator biletCraciun=new BiletCraciun(bilet1);
        biletCraciun.felicitare();
    }
}
