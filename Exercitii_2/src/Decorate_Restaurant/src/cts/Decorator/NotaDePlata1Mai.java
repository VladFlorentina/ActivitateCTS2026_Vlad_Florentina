package cts.Decorator;

import cts.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("felicitari: 1 mai fericit");
    }
}
