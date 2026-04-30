package Decorator.src.Clase.Decorator;

import Decorator.src.Clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{
    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de anul nou!");
    }
}
