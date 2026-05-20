package cts.main;

import cts.clase.InternarelProxy;
import cts.clase.Pacient;
import cts.clase.Spital;
import cts.clase.SpitalAbstract;

public class main {

    public static void main(String[] args) {
        Pacient p=new Pacient("ion",true);
        Pacient p2=new Pacient("mama",false);
        SpitalAbstract s=new Spital("spitalu 1");
        SpitalAbstract sProxy=new InternarelProxy(s);
        sProxy.interneaza(p);
        sProxy.interneaza(p2);
    }
}
