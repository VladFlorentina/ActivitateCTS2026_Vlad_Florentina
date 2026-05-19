package cts.clase.Decorator;

import cts.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract {
    private BiletAbstract biletAbstract;

    public BiletDecorator(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    @Override
    public void printeaza() {
        biletAbstract.printeaza();
    }
    public abstract void felicitare();
}
