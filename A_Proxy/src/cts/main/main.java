package cts.main;

import cts.clase.*;

public class main {

    public static void main(String[] args) {

        MijlocTransport mj1=new Autobuz(23,123);
        MijlocTransport m2=new Autobuz(12,6, TipCursa.NORMALA);

        Statie romana=new Statie("romana",1);
        mj1.opresetStatie(romana);

        MijlocTransport m3=new Autobuz(0,3);
        MijlocTransport m4=new Autobuz(0,5);
        MijlocTransport cursaN=new AutobuzNoapte(m3);
        MijlocTransport cursaN2=new AutobuzNoapte(m4);


        MijlocTransport m5=new Autobuz(23,5,TipCursa.SPECIALA);
        MijlocTransport autobuzSpecial=new AutobuzCursaSpeciala(m5);


        Statie s1=new Statie("papa",0);
        Statie s2=new Statie("ii",5);
        cursaN.opresetStatie(s1);
        cursaN2.opresetStatie(s2);
        autobuzSpecial.opresetStatie(romana);

    }
}
