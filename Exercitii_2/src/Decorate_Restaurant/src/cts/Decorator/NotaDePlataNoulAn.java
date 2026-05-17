package cts.Decorator;

import cts.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{

    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("felicitari : an nou fericit");
    }
}
