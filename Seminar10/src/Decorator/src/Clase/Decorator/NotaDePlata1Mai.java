package Decorator.src.Clase.Decorator;

import Decorator.src.Clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1Mai!");
    }
}
