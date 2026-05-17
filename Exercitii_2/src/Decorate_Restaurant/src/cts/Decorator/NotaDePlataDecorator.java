package cts.Decorator;

import cts.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    protected NotaDePlataAbstract notaDePlataAbstract;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlataAbstract) {
        this.notaDePlataAbstract = notaDePlataAbstract;
    }

    @Override
    public void printeaza() {
        this.notaDePlataAbstract.printeaza();
    }
}
