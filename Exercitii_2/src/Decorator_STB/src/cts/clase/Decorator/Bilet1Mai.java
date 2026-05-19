package cts.clase.Decorator;

import cts.clase.BiletAbstract;

public class Bilet1Mai extends BiletDecorator{

    public Bilet1Mai(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void felicitare() {
        super.printeaza();
        System.out.println("1 mai fericit ");
    }
}
