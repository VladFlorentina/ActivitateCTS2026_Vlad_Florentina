package cts.clase.Decorator;

import cts.clase.BiletAbstract;

public class BiletCraciun extends BiletDecorator{

    public BiletCraciun(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void felicitare() {
        super.printeaza();
        System.out.println(" craciun fericit");
    }
}
